/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misemanasanta01;

/**
 *
 * @author manueljesusgarcialopez
 */
public class CONSTANTES {
    static final int ITIN01[][] = { 
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
            { 0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0 },
            { 0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0 },
            { 0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0 },
            { 0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 }, //5
            { 0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 }, 
            { 0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,0,0,0,0,0,0,0,0,0,0,3,3,0 }, 
            { 0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,0 }, 
            { 0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,0 },
            { 0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0 }, //10
            { 0,3,3,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1 }, 
            { 0,3,3,0,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,0,1,1,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1 }, 
            { 0,3,3,0,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,0,0,0,0,1,1,1,0,3,3,0,1,1,1,1,0,0,0,0,1,1,0,3,3,0,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1 }, 
            { 0,3,3,0,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,0,0,0,0,1,1,1,0,3,3,0,1,1,1,1,0,0,0,0,1,1,0,3,3,0,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1 }, 
            { 0,3,3,0,1,1,1,1,1,0,3,3,0,1,1,1,1,1,0,3,3,0,1,1,1,1,1,0,0,0,0,1,1,1,0,3,3,0,1,1,1,1,0,0,0,0,1,1,0,3,3,0,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1 }, //15
            { 0,3,3,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,0,3,3,0,1,1,1,1,1,0,0,0,0,1,1,1,0,3,3,0,1,1,1,1,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0 },
            { 0,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,1,1,1,0,3,3,0,0,0,0,0,0,0,0,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0 },
            { 0,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,0,0,0,0 }, //20
            { 1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,0,0,0,0 }, 
            { 1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,0,0,0,0 }, 
            { 1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,0,0,0,0 }, 
            { 1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,0,0,0,0 }, 
            { 1,1,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,3,3,0,1,1,1,1,1,1,1,1,0,0,0,0 }, //25
            { 1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,3,3,0,1,1,1,1,1,1,1,1,0,0,0,0 }, 
            { 1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,0,0,0,3,3,0,1,1,1,1,1,1,1,1,0,0,0,0 }, 
            { 1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0 }, 
            { 0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0 }, 
            { 0,0,0,0,0,0,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 }, //30
            { 0,0,0,0,0,0,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 }, 
            { 0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1 }, 
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1 }, 
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0 },//35
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,2,2,2,2,2,2,2,2,2,2,2,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,2,2,2,2,2,2,2,2,2,2,2,0,3,3,3,3,3,3,0,0,0,0,0,0,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,2,2,2,2,2,2,2,2,2,2,2,0,3,3,0,0,0,0,0,1,1,1,1,1,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,2,2,2,2,2,2,2,2,2,2,2,0,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,0 },//40
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,2,2,2,2,2,2,2,2,0,0,0,0,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,2,2,2,2,2,2,2,2,0,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,2,2,2,2,2,2,2,2,0,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },//45
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },//50
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },//55
            { 0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 }//60
        };
    static final int ITIN02[][] = { 
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
            { 0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0 }, //5
            { 0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0 }, 
            { 0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0 }, 
            { 0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0 }, 
            { 0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0 },
            { 0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0 }, //10
            { 0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,3,3,0,0,0,0,0,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1 }, 
            { 0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,3,3,3,3,3,3,0,1,1,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1 }, 
            { 0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,3,3,3,3,3,3,0,1,1,1,1,1,0,0,0,0,1,1,1,0,3,3,0,1,1,1,1,0,0,0,0,1,1,0,3,3,0,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1 }, 
            { 0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,0,0,0,0,1,1,1,0,3,3,0,1,1,1,1,0,0,0,0,1,1,0,3,3,0,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1 }, 
            { 0,0,0,0,1,1,1,1,1,0,0,0,0,1,1,1,1,1,0,3,3,0,1,1,1,1,1,0,0,0,0,1,1,1,0,3,3,0,1,1,1,1,0,0,0,0,1,1,0,3,3,0,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1 }, //15
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,3,3,0,1,1,1,1,1,0,0,0,0,1,1,1,0,3,3,0,1,1,1,1,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,3,3,0 }, //20
            { 1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,3,3,0 }, 
            { 1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,3,3,0 }, 
            { 1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,3,3,0 }, 
            { 1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,3,3,0 }, 
            { 1,1,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,3,3,0,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,3,3,0 }, //25
            { 1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,1,1,1,1,1,1,0,3,3,0 }, 
            { 1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,3,3,3,3,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,3,3,0 }, 
            { 1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0 }, 
            { 0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,0,0,0,3,3,0,0,0,0,0,0,0,0,3,3,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0 }, 
            { 0,0,0,0,0,0,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,0,1,1,1,1,0,0,3,3,3,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0 }, //30
            { 0,0,0,0,0,0,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,0,0,3,3,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 }, 
            { 0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,0,3,3,3,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1 }, 
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1 }, 
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,3,3,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,0,0,0,3,3,3,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0 },//35
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,0,0,0,3,3,3,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,2,2,2,2,2,2,2,2,2,2,2,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,2,2,2,2,2,2,2,2,2,2,2,0,3,3,3,3,3,3,0,0,0,0,0,0,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,2,2,2,2,2,2,2,2,2,2,2,0,3,3,0,0,0,0,0,1,1,1,1,1,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,2,2,2,2,2,2,2,2,2,2,2,0,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,0 },//40
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,2,2,2,2,2,2,2,2,0,0,0,0,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,2,2,2,2,2,2,2,2,0,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,2,2,2,2,2,2,2,2,0,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },//45
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,0,0,0,0,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },//50
            { 0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },//55
            { 0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,3,3,0 },
            { 0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,0 },
            { 0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0 },
            { 0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0 },
            { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 }//60
        };
}
