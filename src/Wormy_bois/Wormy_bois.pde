int worms = 0;
boolean mousePrevPress=false;
void setup() {
  size(800, 800);
  background(200, 230, 255);
}

void draw() {
  float x;
  float y;
  makeMagical();
  for(int i=0; i<worms; i+=1) {
   fill(255, 200, 100);
    x = getWormX(i);
    y = getWormY(i);
    ellipse(x, y, 50, 50);
    println("Worms: " + worms);
  }
  if(mousePressed) {
    
    if(mousePrevPress==false) {
     println("MousePressed");
     worms+=1;
     
  }
  mousePrevPress=true;
   } else {
     mousePrevPress=false;
   }
}
float frequency = 0.005;
float noiseInterval = 3;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
