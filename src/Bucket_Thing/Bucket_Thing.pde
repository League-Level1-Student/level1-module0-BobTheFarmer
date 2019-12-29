int rain1Y = 701;
int rain1X = (int) random(width);
int score = 0;
void setup() {
  size(700, 700);

}
void draw() {
  
  background(100, 200, 255);
  fill(40, 20, 100);
  noStroke();
  ellipse(rain1X, rain1Y, 10, 10);
  rain1Y+=2;
  if(rain1Y>700) {
    rain1X = (int) random(width);
    rain1Y=0;
    score-=1;
    if(score<0) {
      score=0;
    }
  }
  fill(180, 180, 180);
  rect(mouseX-30, 630, 60, 70);
  fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    if(rain1X>630) {
      if(mouseX>rain1X && mouseX<rain1X+60) {
         score+=1;
         rain1X = (int) random(width);
         rain1Y=0;
      }
    }
}
