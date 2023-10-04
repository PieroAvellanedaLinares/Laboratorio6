
package Actores;

import javax.swing.JOptionPane;


public class Curso {
    
    private String nombre;
    private String codigo;
    private int creditos;
    private Alumno[] alumnos;
    private Profesor[] profesores;
    

    public Curso( 
            String nombre, 
            int creditos,  
            String codigo) { 
        this.nombre = nombre;
        this.creditos = creditos;
        this.codigo = codigo;
        this.alumnos = new Alumno[30];
        this.profesores = new Profesor[2];
    }
    public void agregarEstudiante(Alumno alumno){
        
        for (int i = 0; i < 30; i++) {
            if(alumnos[i]==null){
                alumnos[i]=alumno;       
                return;
            }
        }
   
    }
    
    public void agregarProfesor(Profesor profesor){
        
        if(profesores[0]==null){
            profesores[0]=profesor;
        }else if(profesores[1]==null){
            profesores[1]=profesor;
        }else{
          JOptionPane.showMessageDialog(null, "Limite de profesores"
                    + " alcanzado "
                    ,"Agregar Profesor", 
                    JOptionPane.INFORMATION_MESSAGE); 
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }
    
}
