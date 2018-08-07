model MCS
variables:
boolean MCS
boolean SpeedSensor 
boolean PosSensor 
boolean PosSensor1
boolean PosSensor2
boolean Processor 
boolean Feedback 
boolean Visual 
boolean Audio 
boolean Vibration 
boolean Memory 
integer Cores domain: 0..7
integer Size domain: 0..32
constraints:
C_MCS : MCS = 1
cl1: PosSensor1 =>PosSensor
cl2: PosSensor2 =>PosSensor
cl3: PosSensor => ((0<=PosSensor1 +PosSensor2 ) AND(2>=PosSensor1 +PosSensor2 ) )
c9: MCS >= SpeedSensor
C10: MCS >= PosSensor
C3: MCS >= Processor
C4: MCS >= Memory
C5: MCS >= Feedback
c6: Memory <=> (Size > 0)
c7: Processor <=> (Cores > 0)
C11: (Visual => Feedback) AND
(Audio => Feedback) AND
(Vibration => Feedback) AND
(Feedback>= 1) => (Visual+Audio+Vibration >= 1) AND
(Feedback>= 1) => (Visual+Audio+Vibration <= 2) 


