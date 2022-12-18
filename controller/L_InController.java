package controller;

import database.DbConnection;
import Model.loginfile;

public class L_InController{
    DbConnection dbConnection;
}

    public int RetriveLogin(loginfile loginfile){
    String getQuery = String.format("select * from login where ")
}