package com.mkyong;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class EmpDao {
  /* public ArrayList<Empleado> getAllUsers(){
      ArrayList<Empleado> userList = null;
      try {
         File file = new File("Empleados1.txt");
         if (!file.exists()) {
        	 
        	 //Empleado user = new Empleado(10, "Miguel", "Teacher",30);
             userList = new ArrayList<Empleado>();
             /*userList.add(user);
             user = new Empleado(11,"Juan","Contador",45);
             userList.add(user);
             user = new Empleado(12,"Pedro","Tecnico",34);
             
             userList.add(user);
             user = new Empleado(13,"Daniela","Secretaria",20);
             
             userList.add(user);
             user = new Empleado(14,"Pedro","Tecnico",34);
             
             userList.add(user);
             user = new Empleado(15,"Camila","Dev1",34);
             
             userList.add(user);
             user = new Empleado(16,"Ana","Dev1",34);
             
             userList.add(user);
             user = new Empleado(17,"Juli","Dev2",34);
             
             userList.add(user);
             user = new Empleado(18,"Jose","Dev2",34);
             
             userList.add(user);
             user = new Empleado(19,"Teo","Dev3",34);
             
             userList.add(user);
            userList.add( new Empleado(10,"Miguel","Admin",30));
            userList.add( new Empleado(11,"Juan","Contador",45));
            userList.add( new Empleado(12,"Pedro","Tecnico",34));
            userList.add( new Empleado(13,"Daniela","Secretaria",20));
            userList.add( new Empleado(14,"Pedro","Tecnico",34));
            userList.add( new Empleado(15,"Camila","Dev1",34));
            userList.add( new Empleado(16,"Ana","Dev1",34));
            userList.add( new Empleado(17,"Juli","Dev2",34));
            userList.add( new Empleado(18,"Jose","Dev2",34));
            userList.add( new Empleado(19,"Teo","Dev3",34));
            saveUserList(userList);		
         }
         else{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            userList = (ArrayList<Empleado>) ois.readObject();
            ois.close();
         }
      } catch (IOException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }		
      return userList;
   }

   public Empleado getUser(int id){
      ArrayList<Empleado> users = getAllUsers();

      for(Empleado user: users){
         if(user.getId() == id){
            return user;
         }
      }
      return null;
   }

   public int addUser(Empleado pUser){
      ArrayList<Empleado> userList = getAllUsers();
      boolean userExists = false;
      for(Empleado user: userList){
         if(user.getId() == pUser.getId()){
            userExists = true;
            break;
         }
      }		
      if(!userExists){
         userList.add(pUser);
         saveUserList(userList);
         return 1;
      }
      return 0;
   }

   public int updateUser(Empleado pUser){
      ArrayList<Empleado> userList = getAllUsers();

      for(Empleado user: userList){
         if(user.getId() == pUser.getId()){
            int index = userList.indexOf(user);			
            userList.set(index, pUser);
            saveUserList(userList);
            return 1;
         }
      }		
      return 0;
   }

   public int deleteUser(int id){
      ArrayList<Empleado> userList = getAllUsers();

      for(Empleado user: userList){
         if(user.getId() == id){
            int index = userList.indexOf(user);			
            userList.remove(index);
            saveUserList(userList);
            return 1;   
         }
      }		
      return 0;
   }

   private void saveUserList(ArrayList<Empleado> userList){
      try {
         File file = new File("Users.dat");
         FileOutputStream fos;

         fos = new FileOutputStream(file);

         ObjectOutputStream oos = new ObjectOutputStream(fos);		
         oos.writeObject(userList);
         oos.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   } */
}