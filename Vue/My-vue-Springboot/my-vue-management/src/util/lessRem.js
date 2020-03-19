(function (doc, win) {
  let docEl = doc.documentElement,
    resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize',
    recalc = function () {
      let clientWidth = docEl.clientWidth;
      if (!clientWidth) return;
      if(clientWidth>=750){
        docEl.style.fontSize = '100px';
      }else{
        docEl.style.fontSize = 100 * (clientWidth / 750) + 'px';
      }
    };

  if (!doc.addEventListener) return;
  win.addEventListener(resizeEvt, recalc, false);
  doc.addEventListener('DOMContentLoaded', recalc, false);
})(document, window);

// (function(){
//   let html = document.documentElement,
//     hWidth = html.getBoundingClientRect().width;
//   console.log(hWidth);
//   html.style.fontSize = hWidth/15 + "px";//1rem的长度
// })()//根据设计图进行设计，所有的页面完成必须是基于同一个设备或者说是同一分辨率的设备，
// // 比如上面代码中的15是可以根据你所选设备的分辨率自行进行选择，最后让font-size为5的倍数，
// // 上面代码的核心是保证在不同的设备分辨率下可以动态的调整rem（1rem 就等于 html的font-size）
// //使用原生js进行设备的适配
// (function flexible (window, document) {
//   let docEl = document.documentElement;
//   let dpr = window.devicePixelRatio || 1;
//
//   // adjust body font size
//   function setBodyFontSize () {
//     if (document.body) {
//       document.body.style.fontSize = (12 * dpr) + 'px'
//     }
//     else {
//       document.addEventListener('DOMContentLoaded', setBodyFontSize)
//     }
//   }
//   setBodyFontSize();
//
//   // set 1rem = viewWidth / 10
//   function setRemUnit () {
//     let rem = docEl.clientWidth / 10;
//     docEl.style.fontSize = rem + 'px'
//   }
//
//   setRemUnit();
//
//   // reset rem unit on page resize
//   window.addEventListener('resize', setRemUnit)
//   window.addEventListener('pageshow', function (e) {
//     if (e.persisted) {
//       setRemUnit()
//     }
//   });
//
//   // detect 0.5px supports
//   if (dpr >= 2) {
//     let fakeBody = document.createElement('body');
//     let testElement = document.createElement('div');
//     testElement.style.border = '.5px solid transparent';
//     fakeBody.appendChild(testElement);
//     docEl.appendChild(fakeBody);
//     if (testElement.offsetHeight === 1) {
//       docEl.classList.add('hairlines')
//     }
//     docEl.removeChild(fakeBody)
//   }
// }(window, document));
