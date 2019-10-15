var 0..1: PAS;
var 0..1: memory;
var {0, 2, 4, 8, 16, 32}: size;
var 0..7: cores;
var 0..1: processor;
var 0..1: sensors;
var 0..1: feedback;
var 0..1: positionSensor;
var 0..1: speedSensor;
var 0..1: visual;
var 0..1: audio;
var 0..1: vibration;
constraint PAS == 1;
constraint PAS == sensors;
constraint PAS >= processor;
constraint PAS >= memory;
constraint PAS >= feedback;
constraint feedback <= audio + vibration + visual;
constraint audio + vibration + visual <= 2 * feedback;
constraint processor == cores;
constraint memory == size;
constraint sensors >= speedSensor;
constraint sensors >= positionSensor;
constraint processor <= memory;
constraint vibration + speedSensor <= 1;


