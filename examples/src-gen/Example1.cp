model Example1
variables:
boolean Example1
boolean A 
boolean B 
integer C domain: org.xtext.pLhlcl.impl.NumberImpl@6c1dea7 (value: 1)..org.xtext.pLhlcl.impl.NumberImpl@3efcda7e (value: 20)
integer D domain: [org.xtext.pLhlcl.impl.NumberImpl@43245d14 (value: 1), org.xtext.pLhlcl.impl.NumberImpl@4f41faa7 (value: 2), org.xtext.pLhlcl.impl.NumberImpl@20996f72 (value: 3), org.xtext.pLhlcl.impl.NumberImpl@21127ac0 (value: 60)]
integer E domain: [org.xtext.pLhlcl.impl.NumberImpl@5914af2f (value: 10), org.xtext.pLhlcl.impl.NumberImpl@63697411 (value: 20), org.xtext.pLhlcl.impl.NumberImpl@3bd151dc (value: 30)]
boolean T 
boolean X 
integer Y domain: org.xtext.pLhlcl.impl.NumberImpl@7e679b49 (value: 1)..org.xtext.pLhlcl.impl.NumberImpl@1fc6a4ad (value: 50)
boolean Y1 
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
