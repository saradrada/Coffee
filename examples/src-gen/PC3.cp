model PC3
variables:
boolean PC3
boolean Mainboard 
boolean Socket_1151 
boolean Socket_AM4 
boolean RAM 
boolean Power_Supply_Unit 
boolean Optical_Drive 
boolean CPU_Cooler 
boolean Socket_1151_compatible 
boolean Socket_AM4_compatible 
boolean Screen 
constraints:
C_PC3 : PC3 = 1
C4: PC3 = Power_Supply_Unit
C6: PC3 = CPU_Cooler
C5: PC3 >= Optical_Drive
C1: PC3 = Mainboard
C3: Mainboard = RAM
C8: Socket_AM4 => Socket_AM4_compatible
C9: Socket_1151 => Socket_1151_compatible
