model constraints
variables:
integer A domain: 1..5
integer B domain: 1..5
integer D domain: [2,3,4]
bool E domain: [true,false]
symbolic C domain:[a,b,c]
symbolic F domain: [e , f, g]
constraints:
C1: at_most (A C)
C2: E AND A
C3: (E AND A) OR (B AND D)
C4: (D AND B) AND F
C5: (A+B)>1

strategy: one