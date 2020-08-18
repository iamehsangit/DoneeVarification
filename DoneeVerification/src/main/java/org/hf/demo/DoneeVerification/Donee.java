/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hf.demo.DoneeVerification;

import com.google.j2objc.annotations.Property;
import com.owlike.genson.annotation.JsonProperty;
import org.hyperledger.fabric.contract.annotation.DataType;

/**
 *
 * @author ubuntu
 */
@DataType()
public final class Donee {
    
    @Property()
    private final String NID;

    @Property()
    private final String Name;

    @Property()
    private final String Address;

    @Property()
    private final String VerifiedBy;
    
    @Property()
    private final String CreatedBy;
    
    
    public String getNID() {
        return NID;
    }

    public String getName() {
        return Name;
    }
    public String getAddress(){
        return Address;
    }

    public String getVerifiedBy() {
        return VerifiedBy;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }
    
    public Donee(@JsonProperty("NID") final String NID, @JsonProperty("Name") final String Name,
            @JsonProperty("Address") final String Address, @JsonProperty("VerifiedBy") final String VerifiedBy, 
            @JsonProperty("CreatedBy") final String CreatedBy){
        this.NID = NID;
        this.Name = Name;
        this.Address = Address;
        this.VerifiedBy = VerifiedBy;
        this.CreatedBy=CreatedBy;
    }

   
}


