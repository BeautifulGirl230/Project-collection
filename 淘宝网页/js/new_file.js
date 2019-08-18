     <!--多幅图片分页显示特效-->
				var NowFrame = 1;
				var MaxFrame = 4;
				var bStart = 0;
				function fnToggle() {
				var next = NowFrame + 1;
				if(next == MaxFrame+1)
				{
				   NowFrame = MaxFrame;
				   next = 1;
				}
				if(bStart == 0)
				{
				   bStart = 1; 
				   setTimeout('fnToggle()', 3000);
				   return;
				}
				else
				{
				   //oTransContainer.filters[0].Apply();
				   document.images['oDIV'+next].style.display = "";
				   document.images['oDIV'+NowFrame].style.display = "none";
				   //oTransContainer.filters[0].Play(duration=2);
				   if(NowFrame == MaxFrame)
					NowFrame = 1;
				   else
					NowFrame++;
				} 
					setTimeout('fnToggle()', 3000);
				}
				fnToggle();