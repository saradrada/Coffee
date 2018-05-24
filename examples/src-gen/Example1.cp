model Example1
variables:
boolean A 
boolean B 
integer C domain: 1..20
integer D domain: [1, 2, 3, 60]
integer E domain: [10, 20, 30]
boolean T 
boolean X 
integer Y domain: 1..50
constraints:
C1: 
C2: 
C3: 
C4: 
C5: 
C6: Example1 >= T

C7: Example1 = Y

C8: (C1
) => (C2
)

C9: () => (C6
)

C10: (B => A) AND
(T => A) AND
(X => A) AND
(A>= 1) => (org.xtext.pLhlcl.impl.VarDeclarationImpl@ee8b864 (instantiable: false, type: boolean, name: B)+org.xtext.pLhlcl.impl.VarDeclarationImpl@86a6b6c (instantiable: false, type: boolean, name: T)+org.xtext.pLhlcl.impl.VarDeclarationImpl@6c46657f (instantiable: false, type: boolean, name: X) >= 0) AND
(A>= 1) => (org.xtext.pLhlcl.impl.VarDeclarationImpl@ee8b864 (instantiable: false, type: boolean, name: B)+org.xtext.pLhlcl.impl.VarDeclarationImpl@86a6b6c (instantiable: false, type: boolean, name: T)+org.xtext.pLhlcl.impl.VarDeclarationImpl@6c46657f (instantiable: false, type: boolean, name: X) <= 2) 

