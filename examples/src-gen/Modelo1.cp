model Modelo1
variables:
boolean Modelo1
boolean Mainboard 
boolean RAM 
boolean Socket1151 
boolean SocketAM4 
boolean PowerSupplyUnit 
boolean OpticalDrive 
boolean CPUCooler 
boolean Socket1151Compatible 
boolean SocketAM4Compatible 
integer A domain: 1..4
integer B domain: [1, 2, 3, 5]
constraints:
C_Modelo1 : Modelo1 = 1
C1: SocketAM4 => SocketAM4Compatible
C2: Socket1151 => Socket1151Compatible
C3: Modelo1 = Mainboard
C4: Modelo1 = RAM
C5: Modelo1 = PowerSupplyUnit
C6: Modelo1 = CPUCooler
C7: Modelo1 >= OpticalDrive
C8: (Socket1151 => Mainboard) AND
(SocketAM4 => Mainboard) AND
(Mainboard>= 1) => (Socket1151+SocketAM4 >= 1) AND
(Mainboard>= 1) => (Socket1151+SocketAM4 <= 1) 
C9: (SocketAM4Compatible => CPUCooler) AND
(Socket1151Compatible => CPUCooler) AND
(CPUCooler>= 1) => (SocketAM4Compatible+Socket1151Compatible >= 1) AND
(CPUCooler>= 1) => (SocketAM4Compatible+Socket1151Compatible <= 1) 
