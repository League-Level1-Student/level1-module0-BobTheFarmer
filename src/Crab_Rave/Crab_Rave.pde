import ddf.minim.*;
PImage pictureOfRecord;
int angle = 0;
int amountToRotate = 0;
Minim minim;
AudioPlayer song;
void setup() {
  size(600,600);
  pictureOfRecord= loadImage("record.jpeg");
  pictureOfRecord.resize(height,width);
  minim = new Minim(this);
  song = minim.loadFile("83269498_default.mp3", 512);
  background(255);
  image(pictureOfRecord, 0, 0);
}
void draw() {
  
  if(mousePressed) {
    rotateImage(pictureOfRecord, 1);
    song.play();
    image(pictureOfRecord, 0, 0);
  } else {
    song.pause();
  }
  
}
void rotateImage(PImage image, int amountToRotate1) {
   amountToRotate+=amountToRotate1;
   translate(width/2, height/2);
   rotate(amountToRotate*TWO_PI/360);
   translate(-image.width/2, -image.height/2);
}
