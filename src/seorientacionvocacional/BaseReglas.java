/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seorientacionvocacional;

import Rule.*;

/**
 *
 * @author Prado
 */
public class BaseReglas {
    
    //declaracion del tipo de regla
    BooleanRuleBase br = new BooleanRuleBase("test");
    //variables de regla
    RuleVariable leesArticulos;
    RuleVariable hablarPublico;
    RuleVariable innovar;
    RuleVariable pensamientoPositivo;
    RuleVariable exigenteEquipo;
    RuleVariable armarRompecabezas;
    RuleVariable liderEquipo;
    RuleVariable temasPasado;
    RuleVariable manualSobreIntelectual;
    RuleVariable importanteCompartirIdeas;
    RuleVariable trabajarNumeros;
    RuleVariable habilidadMatematicasEstadistica;
    RuleVariable investigarFinanzas;
    RuleVariable funcionamientoCosas;
    RuleVariable resolverProblemas;
    RuleVariable comportamientoHumano;
    RuleVariable recordarFechas;
    RuleVariable conclusionesCriterio;
    RuleVariable personaCreativa;
    RuleVariable aptoMatematicasFisica;
    RuleVariable articulosCientificos;
    RuleVariable conocerCuerpo;
    RuleVariable conocimientoSolucion;
    RuleVariable eresIngenioso; 
    RuleVariable cienciasSociales;
    RuleVariable cienciasSalud;
    RuleVariable cienciasExactas;
    RuleVariable artes;
    RuleVariable administrativas;
    RuleVariable ingenierias;
    RuleVariable carrera;
    String sCienciasSociales;
    String sCienciasSalud;
    String sCienciasExactas;
    String sArtes;
    String sAdministrativas;
    String sIngenierias;
    String scarrera;
    
    
    //instancias de variables de regla
    public void staterBR()
    {
         leesArticulos = new RuleVariable(br,"leesArticulos");
         hablarPublico = new RuleVariable(br,"hablarPublico");
         innovar = new RuleVariable(br,"innovar");
         pensamientoPositivo = new RuleVariable(br,"pensamientoPositivo");
         exigenteEquipo = new RuleVariable(br,"exigenteEquipo");
         armarRompecabezas = new RuleVariable(br,"armarRompecabezas");
         liderEquipo = new RuleVariable(br,"liderEquipo");
         temasPasado = new RuleVariable(br,"temasPasado");
         manualSobreIntelectual = new RuleVariable(br,"manuakSobreIntelectual");
         importanteCompartirIdeas = new RuleVariable(br,"importanteCompartirIdeas");
         trabajarNumeros = new RuleVariable(br,"trabajarNumeros");
         habilidadMatematicasEstadistica = new RuleVariable(br,"habilidadMatematicasEstadistica");
         investigarFinanzas = new RuleVariable(br,"investigarFinanzas");
         funcionamientoCosas = new RuleVariable(br,"funcionamientoCosas");
         resolverProblemas = new RuleVariable(br,"resolverProblemas");
         comportamientoHumano = new RuleVariable(br,"comportamientoHumano");
         recordarFechas = new RuleVariable(br,"recordarFechas");
         conclusionesCriterio = new RuleVariable(br,"conclusionesCriterio");
         personaCreativa = new RuleVariable(br,"personaCreativa");
         aptoMatematicasFisica = new RuleVariable(br,"aptoMatematicasFisica");
         articulosCientificos = new RuleVariable(br,"articulosCientificos");
         conocerCuerpo = new RuleVariable(br,"conocerCuerpo");
         conocimientoSolucion = new RuleVariable(br,"conocimientoSolucion");
         eresIngenioso = new RuleVariable(br,"eresIngenioso");
         
         carrera = new RuleVariable(br,"carrera");
         
         
          //definicion de operadores logicos (condicionales)
         Condition igual = new Condition("=");
       
      //creacion de reglas de validacion (Base de Reglas)
      
      Rule CienciasSociales = new Rule(br,"Ciencias Sociales y Humanidades", 
                   new Clause[]
                   {
                       new Clause(leesArticulos,igual,"si"),
                       new Clause(hablarPublico,igual,"si"),
                       new Clause(innovar,igual,"no"),
                       new Clause(pensamientoPositivo,igual,"no"),
                       new Clause(exigenteEquipo,igual,"si"),
                       new Clause(armarRompecabezas,igual,"no"),
                       new Clause(liderEquipo,igual,"si"),
                       new Clause(temasPasado,igual,"si"),
                       new Clause(manualSobreIntelectual,igual,"no"),
                       new Clause(importanteCompartirIdeas,igual,"no"),
                       new Clause(trabajarNumeros,igual,"no"),
                       new Clause(habilidadMatematicasEstadistica,igual,"no"),
                       new Clause(investigarFinanzas,igual,"no"),
                       new Clause(funcionamientoCosas,igual,"no"),
                       new Clause(resolverProblemas,igual,"no"),
                       new Clause(comportamientoHumano,igual,"si"),
                       new Clause(recordarFechas,igual,"si"),
                       new Clause(conclusionesCriterio,igual,"si"),
                       new Clause(personaCreativa,igual,"no"),
                       new Clause(aptoMatematicasFisica,igual,"no"),
                       new Clause(articulosCientificos,igual,"no"),
                       new Clause(conocerCuerpo,igual,"no"),
                       new Clause(conocimientoSolucion,igual,"no"),
                       new Clause(eresIngenioso,igual,"no"),
                                     
                   },  new Clause(carrera,igual,"Ciencias Sociales y Humanidades"));
      
      
        Rule CienciasSalud = new Rule(br,"Ciencias de la Salud", 
                   new Clause[]
                   {
                       new Clause(leesArticulos,igual,"si"),
                       new Clause(hablarPublico,igual,"no"),
                       new Clause(innovar,igual,"no"),
                       new Clause(pensamientoPositivo,igual,"si"),
                       new Clause(exigenteEquipo,igual,"no"),
                       new Clause(armarRompecabezas,igual,"no"),
                       new Clause(liderEquipo,igual,"no"),
                       new Clause(temasPasado,igual,"no"),
                       new Clause(manualSobreIntelectual,igual,"si"),
                       new Clause(importanteCompartirIdeas,igual,"si"),
                       new Clause(trabajarNumeros,igual,"no"),
                       new Clause(habilidadMatematicasEstadistica,igual,"no"),
                       new Clause(investigarFinanzas,igual,"no"),
                       new Clause(funcionamientoCosas,igual,"no"),
                       new Clause(resolverProblemas,igual,"no"),
                       new Clause(comportamientoHumano,igual,"no"),
                       new Clause(recordarFechas,igual,"no"),
                       new Clause(conclusionesCriterio,igual,"no"),
                       new Clause(personaCreativa,igual,"no"),
                       new Clause(aptoMatematicasFisica,igual,"no"),
                       new Clause(articulosCientificos,igual,"si"),
                       new Clause(conocerCuerpo,igual,"si"),
                       new Clause(conocimientoSolucion,igual,"no"),
                       new Clause(eresIngenioso,igual,"no"),
                                     
                   },  new Clause(carrera,igual,"Ciencias de la Salud"));
        
        Rule CienciasExactas = new Rule(br,"Ciencias Exactas", 
                   new Clause[]
                   {
                       new Clause(leesArticulos,igual,"si"),
                       new Clause(hablarPublico,igual,"no"),
                       new Clause(innovar,igual,"si"),
                       new Clause(pensamientoPositivo,igual,"si"),
                       new Clause(exigenteEquipo,igual,"no"),
                       new Clause(armarRompecabezas,igual,"no"),
                       new Clause(liderEquipo,igual,"no"),
                       new Clause(temasPasado,igual,"si"),
                       new Clause(manualSobreIntelectual,igual,"no"),
                       new Clause(importanteCompartirIdeas,igual,"si"),
                       new Clause(trabajarNumeros,igual,"no"),
                       new Clause(habilidadMatematicasEstadistica,igual,"no"),
                       new Clause(investigarFinanzas,igual,"no"),
                       new Clause(funcionamientoCosas,igual,"no"),
                       new Clause(resolverProblemas,igual,"no"),
                       new Clause(comportamientoHumano,igual,"no"),
                       new Clause(recordarFechas,igual,"no"),
                       new Clause(conclusionesCriterio,igual,"no"),
                       new Clause(personaCreativa,igual,"no"),
                       new Clause(aptoMatematicasFisica,igual,"si"),
                       new Clause(articulosCientificos,igual,"si"),
                       new Clause(conocerCuerpo,igual,"no"),
                       new Clause(conocimientoSolucion,igual,"si"),
                       new Clause(eresIngenioso,igual,"si"),
                                     
                   },  new Clause(carrera,igual,"Ciencias Exactas"));
        
        Rule Artisticas = new Rule(br,"Artisticas, Arquitectura y Diseño", 
                   new Clause[]
                   {
                       new Clause(leesArticulos,igual,"no"),
                       new Clause(hablarPublico,igual,"si"),
                       new Clause(innovar,igual,"si"),
                       new Clause(pensamientoPositivo,igual,"si"),
                       new Clause(exigenteEquipo,igual,"no"),
                       new Clause(armarRompecabezas,igual,"si"),
                       new Clause(liderEquipo,igual,"no"),
                       new Clause(temasPasado,igual,"no"),
                       new Clause(manualSobreIntelectual,igual,"si"),
                       new Clause(importanteCompartirIdeas,igual,"no"),
                       new Clause(trabajarNumeros,igual,"no"),
                       new Clause(habilidadMatematicasEstadistica,igual,"no"),
                       new Clause(investigarFinanzas,igual,"no"),
                       new Clause(funcionamientoCosas,igual,"no"),
                       new Clause(resolverProblemas,igual,"no"),
                       new Clause(comportamientoHumano,igual,"no"),
                       new Clause(recordarFechas,igual,"no"),
                       new Clause(conclusionesCriterio,igual,"no"),
                       new Clause(personaCreativa,igual,"si"),
                       new Clause(aptoMatematicasFisica,igual,"no"),
                       new Clause(articulosCientificos,igual,"no"),
                       new Clause(conocerCuerpo,igual,"no"),
                       new Clause(conocimientoSolucion,igual,"no"),
                       new Clause(eresIngenioso,igual,"no"),
                                     
                   },  new Clause(carrera,igual,"Artisticas, Arquitectura y Diseño"));
        
        Rule Administrativas = new Rule(br,"Economico - Administrativas", 
                   new Clause[]
                   {
                       new Clause(leesArticulos,igual,"si"),
                       new Clause(hablarPublico,igual,"si"),
                       new Clause(innovar,igual,"no"),
                       new Clause(pensamientoPositivo,igual,"no"),
                       new Clause(exigenteEquipo,igual,"si"),
                       new Clause(armarRompecabezas,igual,"no"),
                       new Clause(liderEquipo,igual,"si"),
                       new Clause(temasPasado,igual,"no"),
                       new Clause(manualSobreIntelectual,igual,"no"),
                       new Clause(importanteCompartirIdeas,igual,"no"),
                       new Clause(trabajarNumeros,igual,"si"),
                       new Clause(habilidadMatematicasEstadistica,igual,"si"),
                       new Clause(investigarFinanzas,igual,"si"),
                       new Clause(funcionamientoCosas,igual,"no"),
                       new Clause(resolverProblemas,igual,"no"),
                       new Clause(comportamientoHumano,igual,"no"),
                       new Clause(recordarFechas,igual,"no"),
                       new Clause(conclusionesCriterio,igual,"no"),
                       new Clause(personaCreativa,igual,"no"),
                       new Clause(aptoMatematicasFisica,igual,"no"),
                       new Clause(articulosCientificos,igual,"no"),
                       new Clause(conocerCuerpo,igual,"no"),
                       new Clause(conocimientoSolucion,igual,"no"),
                       new Clause(eresIngenioso,igual,"no"),
                                     
                   },  new Clause(carrera,igual,"Economico - Administrativas"));
        
        Rule Ingenieria = new Rule(br,"Ingenierias", 
                   new Clause[]
                   {
                       new Clause(leesArticulos,igual,"no"),
                       new Clause(hablarPublico,igual,"no"),
                       new Clause(innovar,igual,"si"),
                       new Clause(pensamientoPositivo,igual,"no"),
                       new Clause(exigenteEquipo,igual,"si"),
                       new Clause(armarRompecabezas,igual,"si"),
                       new Clause(liderEquipo,igual,"no"),
                       new Clause(temasPasado,igual,"no"),
                       new Clause(manualSobreIntelectual,igual,"si"),
                       new Clause(importanteCompartirIdeas,igual,"no"),
                       new Clause(trabajarNumeros,igual,"no"),
                       new Clause(habilidadMatematicasEstadistica,igual,"si"),
                       new Clause(investigarFinanzas,igual,"no"),
                       new Clause(funcionamientoCosas,igual,"si"),
                       new Clause(resolverProblemas,igual,"si"),
                       new Clause(comportamientoHumano,igual,"no"),
                       new Clause(recordarFechas,igual,"no"),
                       new Clause(conclusionesCriterio,igual,"no"),
                       new Clause(personaCreativa,igual,"no"),
                       new Clause(aptoMatematicasFisica,igual,"si"),
                       new Clause(articulosCientificos,igual,"no"),
                       new Clause(conocerCuerpo,igual,"no"),
                       new Clause(conocimientoSolucion,igual,"si"),
                       new Clause(eresIngenioso,igual,"no"),
                                     
                   },  new Clause(carrera,igual,"Ingenierias"));
                
    }
    
    public String getCarrera(String LeesArticulos, String HablarPublico, String Innovar, String PensamientoPositivo, 
            String ExigenteEquipo, String ArmarRompecabezas, String LiderEquipo, String TemasPasado, String ManualSobreIntelectual,
            String ImportanteCompartirIdeas, String TrabajarNumeros, String HabilidadMatematicasEstadistica, String InvestigarFinanzas,
            String FuncionamientoCosas, String ResolverProblemas, String ComportamientoHumano, String RecordarFechas, String ConclusionesCriterio,
            String PersonaCreativa, String AptoMatematicasFisica, String ArticulosCientificos, String ConocerCuerpo, String ConocimientoSolucion,
            String EresIngenioso)
    {
        staterBR();
        leesArticulos.setValue(LeesArticulos);
        hablarPublico.setValue(HablarPublico);
        innovar.setValue(Innovar);
        pensamientoPositivo.setValue(PensamientoPositivo);
        exigenteEquipo.setValue(ExigenteEquipo);
        armarRompecabezas.setValue(ArmarRompecabezas);
        liderEquipo.setValue(LiderEquipo);
        temasPasado.setValue(TemasPasado);
        manualSobreIntelectual.setValue(ManualSobreIntelectual);
        importanteCompartirIdeas.setValue(ImportanteCompartirIdeas);
        trabajarNumeros.setValue(TrabajarNumeros);
        habilidadMatematicasEstadistica.setValue(HabilidadMatematicasEstadistica);
        investigarFinanzas.setValue(InvestigarFinanzas);
        funcionamientoCosas.setValue(FuncionamientoCosas);
        resolverProblemas.setValue(ResolverProblemas);
        comportamientoHumano.setValue(ComportamientoHumano);
        recordarFechas.setValue(RecordarFechas);
        conclusionesCriterio.setValue(ConclusionesCriterio);
        personaCreativa.setValue(PersonaCreativa);
        aptoMatematicasFisica.setValue(AptoMatematicasFisica);
        articulosCientificos.setValue(ArticulosCientificos);
        conocerCuerpo.setValue(ConocerCuerpo);
        conocimientoSolucion.setValue(ConocimientoSolucion);
        eresIngenioso.setValue(EresIngenioso);
        
        br.forwardChain();
        scarrera = carrera.getValue();
        return scarrera;
    }
    
}
