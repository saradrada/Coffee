model GPL
variables:
boolean GPL
booleanSSP0booleanSSP1booleanSSP2
constraints:
C_GPL : GPL = 1
c2: GPL = GType
c3: GPL = Algorithms
c4: GPL >= Weight
c5: GPL >= Search
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
c10: (CycleCheck > 0) => (DFS > 0)
c11: (StronglyCon > 0) => (Directed > 0)
c12: (StronglyCon > 0) => (DFS > 0)
c13: (VertexNum > 0) => (Search > 0)
c14: (ConnComp > 0) => (Undirected > 0)
c15: (Kruskal > 0) => (Undirected > 0)
c16: (Kruskal > 0) => (Weighted > 0)
c17: (Prim > 0) => (Undirected > 0)
c18: (Prim > 0) => (Weighted > 0)
c19: (SSP > 0) => (Directed > 0)
c20: (SSP > 0) => (Weighted > 0)
c21: StronglyCon + ConnComp<= 1
c22: StronglyCon + Kruskal<= 1
c23: StronglyCon + Prim<= 1
c24: SSP + ConnComp<= 1
c25: SSP + Kruskal<= 1
c26: SSP + Prim<= 1
