model Example1
variables:
boolean Example1
boolean A 
boolean B 
integer C domain: 1..20
integer D domain: [1, 2, 3, 60]
integer E domain: [10, 20, 30]
boolean T 
boolean X 
integer Y domain: 1..50
constraints:
C_Example1 : Example1 = 1
C1: 
C2: 
C3: 
C4: 
C5: 
C6:  >= T
C7:  = Y
C8: (C1
) => (C2
)
C9: () => (C6
)
C10: 	(B => A) AND
	(T => A) AND
	(X => A) AND
	(A>= 1) => (B+T+X >= 0) AND
	(A>= 1) => (B+T+X <= 2) 
