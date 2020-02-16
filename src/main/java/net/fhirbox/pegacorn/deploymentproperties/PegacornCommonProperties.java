/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fhirbox.pegacorn.deploymentproperties;

/**
 *
 * @author mhunter
 */
public class PegacornCommonProperties {
    
    public final String PEGACORN_COMMUNICATE_IRIS_HOST = "10.111.111.101";
    public final String PEGACORN_COMMUNICATE_ROOMSERVER_HOST = "10.111.111.102";
    public final String PEGACORN_LADON_HOST =  "10.111.111.110";
    
    public String getPegacornCommunicateIrisHost(){
        return(PEGACORN_COMMUNICATE_IRIS_HOST);
    }
    
    public String getPegacornCommunicateRoomServerHost(){
        return(PEGACORN_COMMUNICATE_ROOMSERVER_HOST);
    }
    
    public String getPegacornLadonHost(){
        return(PEGACORN_COMMUNICATE_IRIS_HOST);
    }
    
}
