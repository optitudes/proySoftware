package interrapidisimo.view.model;
import interrapidisimo.view.*;
import interrapidisimo.view.views.*;
import interrapidisimo.*;
import interrapidisimo.domain.*;
import interrapidisimo.ui.*;



public class ModelFactoryModel {

//------------------------------  Singleton ------------------------------------------------

// Clase estatica oculta. Tan solo se instanciara el singleton una vez

   private static class SingletonHolder {
       private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
   }

           // Método para obtener la instancia de nuestra clase

   public static ModelFactoryModel getInstance()  { 
       return SingletonHolder.eINSTANCE;
   }

     private String estado = "NOINICIALIZADO";
     ModelFactory modelFactory = interrapidisimoFactory.eINSTANCE.createModelFactory();

   static String URL = "/test/src/model/model.interrapidisimo";
               
   public ModelFactoryModel() {
        ModelFactory tempModelFactory = modelFactory;
        modelFactory = modelFactory.cargar(URL);
        modelFactory.implementarModelo();
        modelFactory.salvar(URL);
   }

   public ModelFactory getFactoryModel() {
     return modelFactory;
   }
   public void salvar(){
        modelFactory.salvar(URL);
  }

    public void cargar(){
       modelFactory = modelFactory.cargar(URL);
  }
   public UI getTheUI() {
     // TODO Auto-generated method stub
	     return modelFactory.getTheUI();
   }

   public Domain getTheDomain() {
   	// TODO Auto-generated method stub
   	return modelFactory.getTheDomain();
   }
   public void actualizarEstado(String evento) {
	   if(this.estado.equals("NOINICIALIZADO")) {
		   if(evento.equals("iniciar")) {
			   this.estado = "DESACTUALIZADO";
		   }
	   }
	   if(this.estado.equals("ACTUALIZADO")) {
		   if(evento.equals("iniciar")) {
			   this.estado = "DESACTUALIZADO";
		   }
	   }
	   if(this.estado.equals("DESACTUALIZADO")) {
		   if(evento.equals("actualizar")) {
			   this.estado = "ACTUALIZADO";
		   }
	   }
   }

   public String getEstado() {
	   // TODO Auto-generated method stub
	   return estado;
   }

}