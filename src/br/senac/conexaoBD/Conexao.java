/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.conexaoBD;

import java.sql.*;//*importa biblioteca inteira

/**
 *
 * @author julio.gabardo
 */
public class Conexao {

    public static Connection Conector() {
        Connection conexao = null;//variavel conexao
        String driver = "com.mysql.cj.jdbc.Driver";//informação do driver
        String url = "jdbc:mysql://localhost:3306/senac";//localhost= maquina local pode ser substituido por ip para server,senac é o nome do banco
        String user = "root";//usaurio e
        String password = "123qwe@";//senha passagem por parametro

        try {
            Class.forName(driver);//puxando informações do conector do driver da biblioteca java
            conexao = DriverManager.getConnection(url, user, password);//conexao retornando as variasveis de url,senha e usaurio
            return conexao;//retorna variavel conexao
        } catch (Exception e) {
            System.out.println(e);//varial e retorna a informação de erro
            return null;
        }

    }
}
