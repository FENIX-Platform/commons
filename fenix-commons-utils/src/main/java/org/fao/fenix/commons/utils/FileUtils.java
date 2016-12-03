package org.fao.fenix.commons.utils;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

@ApplicationScoped
public class FileUtils {
    public static final Charset UTF8 = Charset.forName("UTF-8");

    public void copy (File source, File destination) throws IOException {
        Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
        if (source.isDirectory())
            for (File sourceFile : source.listFiles())
                copy(sourceFile,new File (destination,sourceFile.getName()));
    }

    public void delete(File toDelete) {
        if (toDelete!=null && toDelete.exists()) {
            if (toDelete.isDirectory())
                for (File f:toDelete.listFiles())
                    delete(f);
            toDelete.delete();
        }
    }

    public String readTextFileFromURL(String url) throws IOException { return readTextFile(new URL(url).openStream());}

    public String readTextFile(String file) throws IOException { return readTextFile(new FileInputStream(file), UTF8); }
    public String readTextFile(File file) throws IOException { return readTextFile(new FileInputStream(file), UTF8); }
    public String readTextFile(String file, Charset charset) throws IOException { return readTextFile(new FileInputStream(file), charset); }
    public String readTextFile(File file, Charset charset) throws IOException {return readTextFile(new FileInputStream(file),charset); }
    public String readTextFile(InputStream in) throws IOException { return readTextFile(in, UTF8); }
    public String readTextFile(InputStream in, Charset charset) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in,charset));
        StringBuilder buffer = new StringBuilder();
        for (String line = reader.readLine(); line!=null; line = reader.readLine())
            buffer.append('\n').append(line);
        return buffer.length()>0 ? buffer.substring(1) : null;
    }

    public void writeTextFile(File file, String text) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(file,false), 1024);
        out.write(text);
        out.flush();
        out.close();
    }



    public void unzip(File source, File destination, boolean overwrite) throws IOException {
        if (source==null || !source.exists() || !source.isFile())
            throw new FileNotFoundException(source!=null ? source.getAbsolutePath() : null);
        unzip(new FileInputStream(source), destination, overwrite);
    }
    public void unzip(InputStream source, File destination, boolean overwrite) throws IOException {
        if (destination==null || destination.isFile())
            throw new FileNotFoundException("<destination>");
        if (!destination.exists())
            destination.mkdirs();

        ZipInputStream in = new ZipInputStream(source);
        try {
            for (ZipEntry entry = in.getNextEntry(); entry != null; entry = in.getNextEntry()) {
                File entryFile = new File(destination, entry.getName());
                if (entryFile.exists())
                    if (overwrite)
                        delete(entryFile);
                    else
                        throw new IOException("Cannot overwrite an existing destination file: " + entryFile.getAbsolutePath());

                if (entry.isDirectory())
                    entryFile.mkdirs();
                else {
                    OutputStream out = new FileOutputStream(entryFile);
                    copy(out, in);
                    out.close();
                }
            }
        } finally {
            if (in!=null)
                in.close();
        }
    }

    public void zip(File source, File destination, boolean overwrite) throws IOException {
        if (destination==null)
            throw new FileNotFoundException("<destination>");
        if (destination.exists())
            if (overwrite)
                delete(destination);
            else
                throw new IOException("Cannot overwrite an existing destination file: "+destination.getAbsolutePath());

        zip(source, new FileOutputStream(destination), overwrite);
    }
    public void zip(File source, OutputStream destination, boolean overwrite) throws IOException {
        if (source==null || !source.exists())
            throw new FileNotFoundException(source!=null ? source.getAbsolutePath() : null);

        ZipOutputStream out = new ZipOutputStream(destination);
        try {
            zip(source, out, "");
        } finally {
            if (out!=null)
                out.close();
        }
    }
    private void zip(File source, ZipOutputStream out, String entryPath) throws IOException {
        entryPath += source.getName() + (source.isDirectory() ? File.separatorChar : "");
        try {
            out.putNextEntry(new ZipEntry(entryPath));

            if (source.isFile()) {
                InputStream in = new FileInputStream(source);
                copy(out, in);
                in.close();
            } else
                for (File child : source.listFiles())
                    zip(child, out, entryPath);

            out.closeEntry();
        } catch (ZipException ex) {
            System.out.println(ex.getMessage());
        }
    }
    private void copy (OutputStream out, InputStream in) throws IOException {
        byte[] buffer = new byte[1024];
        for (int c=in.read(buffer); c>0; c=in.read(buffer))
            out.write(buffer,0,c);
        out.flush();
    }

}
