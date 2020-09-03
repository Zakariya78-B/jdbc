package com.mycompagny.tennis.core.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;



import com.mycompagny.tennis.core.DataSourceProvider;
import com.mycompagny.tennis.core.entity.Joueur;

public class JoueurRepositoryImpl {
	 public void create(Joueur joueur) {
	        Connection conn = null;
	        try {
	        	DataSource dataSource=DataSourceProvider.getSingleDataSourceInstance();
	        	
	        	conn=dataSource.getConnection();
	        	
	        	
	        	
	        	PreparedStatement ps = conn.prepareStatement("INSERT INTO JOUEUR (NOM,PRENOM,SEXE)VALUES(?,?,?)");
	      
	        	ps.setString(1, joueur.getNom());
	        	ps.setString(2, joueur.getPrenom());
	        	ps.setString(3, joueur.getSexe().toString());
	        	
	        	ps.executeUpdate();
	        	
	        	
	               
	            
	            System.out.println("Joueur créé");
	        } catch (SQLException e) {
	            e.printStackTrace();
	            try {
	                if (conn!=null) conn.rollback(); 
	                    
	                }catch (SQLException el) {
	    	            el.printStackTrace();
	        }
	       }
	        finally {
	        	try {
	        		if(conn!=null) {
	        			conn.close();
	        		}
	        	
	            
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	 }
	 public void update(Joueur joueur) {
	        Connection conn = null;
	        try {
	        	DataSource dataSource=DataSourceProvider.getSingleDataSourceInstance();
	        	
	        	conn=dataSource.getConnection();
	        	
	        	
	        	
	        	PreparedStatement ps = conn.prepareStatement("UPDATE JOUEUR SET NOM=?,PRENOM=?,SEXE=? WHERE ID=?");
	      
	        	ps.setString(1, joueur.getNom());
	        	ps.setString(2, joueur.getPrenom());
	        	ps.setString(3, joueur.getSexe().toString());
	        	ps.setInt(4, joueur.getId());
	        	
	        	ps.executeUpdate();
	        	
	        	
	               
	            
	            System.out.println("Joueur modifié");
	        } catch (SQLException e) {
	            e.printStackTrace();
	            try {
	                if (conn!=null) conn.rollback(); 
	                    
	                }catch (SQLException el) {
	    	            el.printStackTrace();
	        }
	       }
	        finally {
	        	try {
	        		if(conn!=null) {
	        			conn.close();
	        		}
	        	
	            
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	 }
	 public void delete(Integer id) {
	        Connection conn = null;
	        try {
	        	DataSource dataSource=DataSourceProvider.getSingleDataSourceInstance();
	        	
	        	conn=dataSource.getConnection();
	        	
	        	
	        	
	        	PreparedStatement ps = conn.prepareStatement("DELETE FROM JOUEUR WHERE ID=?");
	      
	        
	        	ps.setInt(1, id);
	        	
	        	ps.executeUpdate();
	        	
	        	
	               
	            
	            System.out.println("Joueur supprimé");
	        } catch (SQLException e) {
	            e.printStackTrace();
	            try {
	                if (conn!=null) conn.rollback(); 
	                    
	                }catch (SQLException el) {
	    	            el.printStackTrace();
	        }
	       }
	        finally {
	        	try {
	        		if(conn!=null) {
	        			conn.close();
	        		}
	        	
	            
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	 }
	 public Joueur getById(Integer id){
		 	
	        Connection conn = null;
	        Joueur joueur =null;
	        try {
	        	DataSource dataSource=DataSourceProvider.getSingleDataSourceInstance();
	        	conn=dataSource.getConnection();
	        	
	        	
	        	
	        	PreparedStatement ps = conn.prepareStatement("SELECT  NOM,PRENOM,SEXE FROM JOUEUR WHERE ID=?");
	      
	        
	        	ps.setInt(1, id);
	        	        	
	        	ResultSet rs = ps.executeQuery();
	        	
	        	if(rs.next()) {
	        		joueur = new Joueur();
	        		joueur.setId(id);
	        		joueur.setNom(rs.getString("NOM"));
	        		joueur.setPrenom(rs.getString("PRENOM"));
	        		joueur.setSexe(rs.getString("SEXE").charAt(0));
	        		
	        		
	        	}
	        	
	        	
	               
	            
	            System.out.println("Joueur lu");
	        } catch (SQLException e) {
	            e.printStackTrace();
	            try {
	                if (conn!=null) conn.rollback(); 
	                    
	                }catch (SQLException el) {
	    	            el.printStackTrace();
	        }
	       }
	        finally {
	        	try {
	        		if(conn!=null) {
	        			conn.close();
	        		}
	        	
	            
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        return joueur;
	 }
	 public List<Joueur> list(){
		 	
	        Connection conn = null;
	        List<Joueur> joueurs =new ArrayList<Joueur>();
	        try {
	        	DataSource dataSource=DataSourceProvider.getSingleDataSourceInstance();
	        	
	        	conn=dataSource.getConnection();
	        	
	        	
	        	
	        	PreparedStatement ps = conn.prepareStatement("SELECT ID,NOM,PRENOM,SEXE FROM JOUEUR");
	      
	        
	        	
	        	        	
	        	ResultSet rs = ps.executeQuery();
	        	
	        	while(rs.next()) {
	        		Joueur joueur = new Joueur();
	        		joueur.setId(rs.getInt("ID"));
	        		joueur.setNom(rs.getString("NOM"));
	        		joueur.setPrenom(rs.getString("PRENOM"));
	        		joueur.setSexe(rs.getString("SEXE").charAt(0));
	        		
	        		joueurs.add(joueur);
	        	}
	        	
	        	
	               
	            
	            System.out.println("Joueurs lus");
	        } catch (SQLException e) {
	            e.printStackTrace();
	            try {
	                if (conn!=null) conn.rollback(); 
	                    
	                }catch (SQLException el) {
	    	            el.printStackTrace();
	        }
	       }
	        finally {
	        	try {
	        		if(conn!=null) {
	        			conn.close();
	        		}
	        	
	            
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        return joueurs;
	 }
}
