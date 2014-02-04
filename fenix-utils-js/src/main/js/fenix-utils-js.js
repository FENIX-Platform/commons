/*global window, $*/

function showErrorMsg(m, id){
	var c = document.createElement("div");
	c.setAttribute('class', 'alert alert-error');
	c.innerHTML = '<button type="button" class="close" data-dismiss="alert">&times;</button><strong>Warning!</strong> '+m;
	if (document.getElementById(id)) { document.getElementById(id).appendChild(c);}
	else  { window.alert(m) ;}
}

function getQuerystringParam(){
  var v, q, i, hash;
  v = [];
  q = document.URL.split('?')[1];
  if(q !== undefined){
      q = q.split('&');
      for(i = 0; i < q.length; i++){
          hash = q[i].split('=');
          v.push(hash[1]);
          v[hash[0]] = hash[1];
      }
  }
  return v;
}

(function() {
    $.fn.goTo = function() {
        $('html, body').animate({
            scrollTop: $(this).offset().top + 'px'
        }, 'fast');
        return this; // for chaining...
    };
}());

function raiseCustomEvent(item , type, data){
  //Dispatch an event for Chrome, Fireofox e IE
  var evt = document.createEvent("CustomEvent");
  evt.initCustomEvent(type, true, true, data);
  item.dispatchEvent(evt);
}

function updateQuerystringParam(k, v, f){
  var url, queries, p, m, n, i;
  url = location.pathname.substring(location.pathname.lastIndexOf("/") + 1);
  queries = location.search.substring(1);
  p = false;

  url += '?';
  if (queries){
    n=queries.split("&");
    for (i = 0; i<n.length; i++){
      m = n[i].split("=");
      if (m[0] !== k){
        if (m[0] !== f) { url += m[0] + '=' + m[1] + '&';}
      } else {
        url += k + '=' + v + '&';
        p = true;
      }
    }
    if (!p) { url += k + '=' + v + '&'; }
    url = url.substring(0, url.length - 1);
  } else {
    url += k + '=' + v;
  }
  return url;
}

function resetQuerystringParam(v){
  var url = location.pathname.substring(location.pathname.lastIndexOf("/") + 1);
  url += '?tab' + '=' + v;
  return url;
}

(function() {
  $.fn.scrollStopped = function(callback) {
      var self, $this;       
      $(this).scroll(function(){
          self = this; 
          $this = $(self);
          if ($this.data('scrollTimeout')) {
            clearTimeout($this.data('scrollTimeout'));
          }
          $this.data('scrollTimeout', setTimeout(callback,500,self));
      });
  };
}());

function countTo(s_el, to, duration, easing){

  var d, e;

  if (!duration) { d = 1500; }
  else { d = duration; }

  if (!easing) { e = 'easeOutQuint'; }
  else { e = easing; }

  function commaSeparateNumber(val){
    while (/(\d+)(\d{3})/.test(val.toString())){
      val = val.toString().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,");
    }
    return val;
  }

  // Animate the element's value from x to y:
  $({someValue: to - 1000}).animate({someValue: to}, {
      duration: d,
      easing: e, // can be anything
      step: function() { // called on every step
          // Update the element's text with rounded-up value:
          $(s_el).text(commaSeparateNumber(Math.round(this.someValue)));
      }
  });
}

function generateDynamicId(e, replace){
    
    var r, o;
    if (replace) { r = replace; }
    else { r = 'REPLACE'; }

    if( window.fx_dynamic_id_counter > -1 ){ window.fx_dynamic_id_counter ++ ;}
    else { window.fx_dynamic_id_counter = 0; }

    $(e).find("[id*='"+r+"'], [href*='"+r+"']").each(function(){
        o = $(this).attr('id');
        if (o) { $(this).attr('id' , o.replace(r, window.fx_dynamic_id_counter)); }

        o = $(this).attr('href');
        if (o) { $(this).attr('href' , o.replace(r, window.fx_dynamic_id_counter)); }
    });

}

function extend(a, b){
    var key;
    for(key in b) { if(b.hasOwnProperty(key)) {a[key] = b[key]; }}          
    return a;
}