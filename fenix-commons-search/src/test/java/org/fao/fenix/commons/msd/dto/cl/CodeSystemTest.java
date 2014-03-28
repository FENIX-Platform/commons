package org.fao.fenix.commons.msd.dto.cl;

import static org.junit.Assert.*;

import org.fao.fenix.commons.msd.dto.cl.type.CycleCodeReferenceException;
import org.fao.fenix.commons.msd.dto.cl.type.DuplicateCodeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class CodeSystemTest {
    private CodeSystem clTest;

    @Before
    public void setUp() throws Exception {
        clTest = new CodeSystem("testCL","1");
    }

    @After
    public void tearDown() throws Exception {
        clTest = null;
    }

    @Test
    public void testSetRootCodes() throws Exception {
        createCodesGraph(clTest);

        Collection<Code> codes = null;

        try { codes = createCodesTree(clTest); } catch (DuplicateCodeException ex) { }
        assertNotNull(codes);

        try { clTest.setRootCodes(codes); } catch (DuplicateCodeException ex) { assertTrue(false); }

        try {
            clTest.addCode(new Code(clTest,"2"));
            assertTrue(false);
        } catch (DuplicateCodeException ex) { }

        clTest = new CodeSystem("testCL","1");
        codes.add(new Code(clTest,"2"));
        try {
            clTest.setRootCodes(codes);
            assertTrue(false);
        } catch (DuplicateCodeException ex) { }
    }

    @Test
    public void testNormalize() throws Exception {
        try {
            clTest.setRootCodes(createCodesGraph(clTest));
            clTest.normalize();
        } catch (DuplicateCodeException ex) {
            assertTrue(false);
        } catch (CycleCodeReferenceException ex) {
            assertTrue(false);
        }

        assertEquals(3, clTest.getLevelsNumber().intValue());
        assertEquals(3, clTest.getRootCodes().size());
        Code code = null;
        for (Code c : clTest.getRootCodes())
            if (c.getCode().equals("12"))
                code = c;
        assertEquals(4, code.getChilds().size());
        assertTrue(((Set) code.getChilds()).containsAll(
                        Arrays.asList(
                                new Code(clTest,"121"),
                                new Code(clTest,"221"),
                                new Code(clTest,"31"),
                                new Code(clTest,"32")
                        )));

        Map<String,Code> visited = new HashMap<>();
        Code error = null;
        for (Code c : clTest.getRootCodes()) {
            error = checkNoRepeat(c, visited);
            assertNull(error != null ? error.toString() : "", error);
        }
    }

    private Code checkNoRepeat (Code code, Map<String,Code> visited) {
        Code visitedCode = visited.get(code.getCode());
        if (visitedCode!=null && visitedCode!=code)
            return visitedCode;
        visited.put(code.getCode(), code);

        if (visitedCode==null && !code.isLeaf())
            for (Code c : code.getChilds())
                if ((visitedCode=checkNoRepeat(c,visited))!=null)
                    return visitedCode;

        return null;
    }

    private Collection<Code> createCodesWithCycle(CodeSystem cl) throws DuplicateCodeException {
        Collection<Code> codes = new LinkedList<>();
        Code code = null;
        Code child = null;

        codes.add(code = new Code(cl,"1"));
        code.addChild(child = new Code(cl,"11"));
        code.addChild(child = new Code(cl,"12"));
        code = child;
        code.addChild(child = new Code(cl,"1"));
        code.addChild(child = new Code(cl,"121"));

        codes.add(code = new Code(cl,"2"));
        code.addChild(child = new Code(cl,"21"));
        code.addChild(child = new Code(cl,"22"));

        return codes;
    }
    private Collection<Code> createCodesTree(CodeSystem cl) throws DuplicateCodeException {
        Collection<Code> codes = new LinkedList<>();
        Code code = null;
        Code child = null;

        codes.add(code = new Code(cl,"1"));
        code.addChild(child = new Code(cl,"11"));
        code.addChild(child = new Code(cl,"12"));
        code = child;
        code.addChild(child = new Code(cl,"121"));

        codes.add(code = new Code(cl, "2"));
        code.addChild(child = new Code(cl,"21"));
        code.addChild(child = new Code(cl, "22"));
        code = child;
        code.addChild(child = new Code(cl,"221"));

        return codes;
    }
    private Collection<Code> createCodesGraph(CodeSystem cl) throws DuplicateCodeException {
        Collection<Code> codes = new LinkedList<>();
        Code code = null;
        Code child = null;

        codes.add(code = new Code(cl,"1"));
        code.addChild(child = new Code(cl,"11"));
        code.addChild(child = new Code(cl,"12"));
        code = child;
        code.addChild(child = new Code(cl,"121"));

        codes.add(code = new Code(cl, "2"));
        code.addChild(child = new Code(cl, "21"));
        code.addChild(child = new Code(cl,"12"));
        code = child;
        code.addChild(child = new Code(cl,"221"));

        codes.add(code = new Code(cl,"12"));
        code.addChild(child = new Code(cl, "31"));
        code.addChild(child = new Code(cl, "32"));
        code = child;
        code.addChild(child = new Code(cl, "321"));

        return codes;
    }
}
