model Facturacion_Serv_Publicos
variables:
boolean Facturacion_Serv_Publicos
boolean Tipo_de_Servicio 
boolean Energia 
boolean Agua 
boolean Alcantarillado 
boolean Aseo 
boolean Gas 
boolean Alumbrado_Publico 
boolean Registro_Consumo 
boolean RegAutomatico 
boolean RegManual 
boolean RegPrepago 
boolean Liquidacion 
boolean Liq_Manual 
boolean Generar_Doc_Factura 
boolean Subir_cargos_Pendientes 
boolean Liq_Automatica 
boolean Liq_aut_Individual 
boolean Liq_Ind_aut_Saldos 
boolean Liq_Ind_aut_Consumos 
boolean Liq_Ind_aut_Servicios 
boolean Liq_Ind_aut_Cargos_Externos 
boolean Liq_aut_Masiva 
boolean Liq_mas_aut_Saldos 
boolean Liq_mas_aut_Consumos 
boolean Liq_mas_aut_Servicios 
boolean Liq_mas_aut_Cargos_Externos 
boolean Motor_liquidacion 
boolean Motor_secuencial 
boolean Motor_paralelo 
boolean Gestion_Tarifaria 
boolean Gest_Tar_Impuestos 
boolean Gest_Tar_Consumos_Horarios 
boolean Otros_Cobros 
boolean Ges_tar_Reglas_Dinamicas 
boolean Ges_tar_reglas_codigo 
boolean Emision_factura 
boolean Emis_fact_Regulatoria 
boolean Emis_fact_Digital_Individual_Web 
boolean Ticket 
boolean CopiaFiel 
boolean EstadoCuenta 
boolean Conf_Factura 
boolean Conf_fact_Modulo_extraccion 
boolean Conf_fact_estatico 
boolean Analisis_Consumos 
boolean An_cons_sencillos 
boolean An_sen_Mineria 
boolean An_sen_reglas 
boolean An_cons_horarios 
boolean An_hor_Mineria 
boolean An_hor_Reglas 
boolean An_Perdidas 
boolean An_perdidas_Sectores 
boolean An_perdidas_Agregado 
constraints:
C_Facturacion_Serv_Publicos : Facturacion_Serv_Publicos = 1
C1: Facturacion_Serv_Publicos = Tipo_de_Servicio
C3: Facturacion_Serv_Publicos = Registro_Consumo
C5: Facturacion_Serv_Publicos = Liquidacion
C9: Liq_aut_Individual = Liq_Ind_aut_Saldos
C10: Liq_aut_Individual = Liq_Ind_aut_Consumos
C13: Liq_aut_Masiva = Liq_mas_aut_Saldos
C14: Liq_aut_Masiva = Liq_mas_aut_Consumos
C17: Liquidacion = Motor_liquidacion
C19: Facturacion_Serv_Publicos = Gestion_Tarifaria
C25: Emision_factura = Conf_Factura
C11: Liq_aut_Individual >= Liq_Ind_aut_Servicios
C12: Liq_aut_Individual >= Liq_Ind_aut_Cargos_Externos
C15: Liq_aut_Masiva >= Liq_mas_aut_Servicios
C16: Liq_aut_Masiva >= Liq_mas_aut_Cargos_Externos
C22: Facturacion_Serv_Publicos >= Emision_factura
C27: Facturacion_Serv_Publicos >= Analisis_Consumos
C32: Emis_fact_Regulatoria + Conf_fact_estatico<= 1
C33: Energia => Alumbrado_Publico
C34: Liq_Automatica => Gest_Tar_Impuestos
C35: Liq_aut_Masiva + Motor_secuencial<= 1
C36: Liq_Ind_aut_Servicios => Subir_cargos_Pendientes
C37: Liq_Ind_aut_Cargos_Externos => Subir_cargos_Pendientes
C38: Liq_mas_aut_Servicios => Subir_cargos_Pendientes
C39: Liq_mas_aut_Cargos_Externos => Subir_cargos_Pendientes
C40: Gest_Tar_Consumos_Horarios + Ges_tar_reglas_codigo<= 1
C41: Agua => Alcantarillado
C42: RegPrepago => Liq_aut_Individual
C2: (Energia => Tipo_de_Servicio) AND
(Agua => Tipo_de_Servicio) AND
(Alcantarillado => Tipo_de_Servicio) AND
(Aseo => Tipo_de_Servicio) AND
(Gas => Tipo_de_Servicio) AND
(Alumbrado_Publico => Tipo_de_Servicio) AND
(Tipo_de_Servicio>= 1) => (Energia+Agua+Alcantarillado+Aseo+Gas+Alumbrado_Publico >= 1) AND
(Tipo_de_Servicio>= 1) => (Energia+Agua+Alcantarillado+Aseo+Gas+Alumbrado_Publico <= 6) 
C4: (RegAutomatico => Registro_Consumo) AND
(RegManual => Registro_Consumo) AND
(RegPrepago => Registro_Consumo) AND
(Registro_Consumo>= 1) => (RegAutomatico+RegManual+RegPrepago >= 1) AND
(Registro_Consumo>= 1) => (RegAutomatico+RegManual+RegPrepago <= 3) 
C6: (Liq_Manual => Liquidacion) AND
(Liq_Automatica => Liquidacion) AND
(Liquidacion>= 1) => (Liq_Manual+Liq_Automatica >= 1) AND
(Liquidacion>= 1) => (Liq_Manual+Liq_Automatica <= 2) 
C7: (Generar_Doc_Factura => Liq_Manual) AND
(Subir_cargos_Pendientes => Liq_Manual) AND
(Liq_Manual>= 1) => (Generar_Doc_Factura+Subir_cargos_Pendientes >= 1) AND
(Liq_Manual>= 1) => (Generar_Doc_Factura+Subir_cargos_Pendientes <= 2) 
C8: (Liq_aut_Individual => Liq_Automatica) AND
(Liq_aut_Masiva => Liq_Automatica) AND
(Liq_Automatica>= 1) => (Liq_aut_Individual+Liq_aut_Masiva >= 1) AND
(Liq_Automatica>= 1) => (Liq_aut_Individual+Liq_aut_Masiva <= 2) 
C18: (Motor_secuencial => Motor_liquidacion) AND
(Motor_paralelo => Motor_liquidacion) AND
(Motor_liquidacion>= 1) => (Motor_secuencial+Motor_paralelo >= 1) AND
(Motor_liquidacion>= 1) => (Motor_secuencial+Motor_paralelo <= 2) 
C20: (Gest_Tar_Impuestos => Gestion_Tarifaria) AND
(Gest_Tar_Consumos_Horarios => Gestion_Tarifaria) AND
(Gest_Tar_Consumos_Horarios => Gestion_Tarifaria) AND
(Otros_Cobros => Gestion_Tarifaria) AND
(Gestion_Tarifaria>= 1) => (Gest_Tar_Impuestos+Gest_Tar_Consumos_Horarios+Gest_Tar_Consumos_Horarios+Otros_Cobros >= 1) AND
(Gestion_Tarifaria>= 1) => (Gest_Tar_Impuestos+Gest_Tar_Consumos_Horarios+Gest_Tar_Consumos_Horarios+Otros_Cobros <= 4) 
C21: (Ges_tar_Reglas_Dinamicas => Gestion_Tarifaria) AND
(Ges_tar_reglas_codigo => Gestion_Tarifaria) AND
(Gestion_Tarifaria>= 1) => (Ges_tar_Reglas_Dinamicas+Ges_tar_reglas_codigo >= 1) AND
(Gestion_Tarifaria>= 1) => (Ges_tar_Reglas_Dinamicas+Ges_tar_reglas_codigo <= 1) 
C23: (Emis_fact_Regulatoria => Emision_factura) AND
(Emis_fact_Digital_Individual_Web => Emision_factura) AND
(Emision_factura>= 1) => (Emis_fact_Regulatoria+Emis_fact_Digital_Individual_Web >= 1) AND
(Emision_factura>= 1) => (Emis_fact_Regulatoria+Emis_fact_Digital_Individual_Web <= 2) 
C24: (Ticket => Emis_fact_Digital_Individual_Web) AND
(CopiaFiel => Emis_fact_Digital_Individual_Web) AND
(EstadoCuenta => Emis_fact_Digital_Individual_Web) AND
(Emis_fact_Digital_Individual_Web>= 1) => (Ticket+CopiaFiel+EstadoCuenta >= 1) AND
(Emis_fact_Digital_Individual_Web>= 1) => (Ticket+CopiaFiel+EstadoCuenta <= 3) 
C26: (Conf_fact_Modulo_extraccion => Conf_Factura) AND
(Conf_fact_estatico => Conf_Factura) AND
(Conf_Factura>= 1) => (Conf_fact_Modulo_extraccion+Conf_fact_estatico >= 1) AND
(Conf_Factura>= 1) => (Conf_fact_Modulo_extraccion+Conf_fact_estatico <= 1) 
C28: (An_cons_sencillos => Analisis_Consumos) AND
(An_cons_horarios => Analisis_Consumos) AND
(An_Perdidas => Analisis_Consumos) AND
(Analisis_Consumos>= 1) => (An_cons_sencillos+An_cons_horarios+An_Perdidas >= 1) AND
(Analisis_Consumos>= 1) => (An_cons_sencillos+An_cons_horarios+An_Perdidas <= 3) 
C29: (An_sen_Mineria => An_cons_sencillos) AND
(An_sen_reglas => An_cons_sencillos) AND
(An_cons_sencillos>= 1) => (An_sen_Mineria+An_sen_reglas >= 1) AND
(An_cons_sencillos>= 1) => (An_sen_Mineria+An_sen_reglas <= 1) 
C30: (An_hor_Mineria => An_cons_horarios) AND
(An_hor_Reglas => An_cons_horarios) AND
(An_cons_horarios>= 1) => (An_hor_Mineria+An_hor_Reglas >= 1) AND
(An_cons_horarios>= 1) => (An_hor_Mineria+An_hor_Reglas <= 1) 
C31: (An_perdidas_Sectores => An_Perdidas) AND
(An_perdidas_Agregado => An_Perdidas) AND
(An_Perdidas>= 1) => (An_perdidas_Sectores+An_perdidas_Agregado >= 1) AND
(An_Perdidas>= 1) => (An_perdidas_Sectores+An_perdidas_Agregado <= 1) 
