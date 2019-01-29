model GPLCard
variables:
boolean GPLCard
boolean GType 
boolean Weight 
boolean Search 
boolean Algorithms 
boolean Algorithms1
boolean Algorithms2
boolean Directed 
boolean Undirected 
boolean Weighted 
boolean Unweighted 
boolean BFS 
boolean DFS 
boolean Kruskal 
boolean CycleCheck 
boolean StronglyCon 
boolean VertexNum 
boolean ConnComp 
boolean SSP 
boolean SSP1
boolean SSP2
boolean SSP3
boolean Prim 
boolean MST 
constraints:
C_GPLCard : GPLCard = 1
clon1: Algorithms => ((1<=Algorithms1 +Algorithms2 ) AND(2>=Algorithms1 +Algorithms2 ) )
clon2: SSP => ((1<=SSP1 +SSP2 +SSP3 ) AND(3>=SSP1 +SSP2 +SSP3 ) )
c2: GPLCard = GType
c3: GPLCard = Algorithms
c4: GPLCard >= Weight
c5: GPLCard >= Search
c6: (Directed => GType) AND
(Undirected => GType) AND
(GType>= 1) => (Directed+Undirected >= 1) AND
(GType>= 1) => (Directed+Undirected <= 1) 
c7: (Weighted => Weight) AND
(Unweighted => Weight) AND
(Weight>= 1) => (Weighted+Unweighted >= 1) AND
(Weight>= 1) => (Weighted+Unweighted <= 1) 
c8: (BFS => Search) AND
(DFS => Search) AND
(Search>= 1) => (BFS+DFS >= 1) AND
(Search>= 1) => (BFS+DFS <= 1) 
c9: (CycleCheck => Algorithms) AND
(StronglyCon => Algorithms) AND
(VertexNum => Algorithms) AND
(ConnComp => Algorithms) AND
(SSP => Algorithms) AND
(Algorithms>= 1) => (CycleCheck+StronglyCon+VertexNum+ConnComp+SSP >= 0) AND
(Algorithms>= 1) => (CycleCheck+StronglyCon+VertexNum+ConnComp+SSP <= 5) 
C92: Algorithms = MST
cNew: (Kruskal => MST) AND
(Prim => MST) AND
(MST>= 1) => (Kruskal+Prim >= 0) AND
(MST>= 1) => (Kruskal+Prim <= 2) 
c10: CycleCheck  => DFS 
c11: StronglyCon  => Directed 
c12: StronglyCon  => DFS 
c13: VertexNum  => Search 
c14: ConnComp  => Undirected 
c15: Kruskal  => Undirected 
c16: Kruskal  => Weighted 
c17: Prim  => Undirected 
c18: Prim  => Weighted 
c19: (SSP1 => Directed) AND (SSP2 => Directed) AND (SSP3 => Directed)
c20: (SSP1 => Weighted) AND (SSP2 => Weighted) AND (SSP3 => Weighted)
c21: StronglyCon + ConnComp<= 1 
c22: StronglyCon + Kruskal<= 1 
c23: StronglyCon + Prim<= 1 
c24: (SSP1 + ConnComp<= 1) AND (SSP2 + ConnComp<= 1) AND (SSP3 + ConnComp<= 1)
c25: (SSP1 + Kruskal<= 1) AND (SSP2 + Kruskal<= 1) AND (SSP3 + Kruskal<= 1)
c26: (SSP1 + Prim<= 1) AND (SSP2 + Prim<= 1) AND (SSP3 + Prim<= 1)
