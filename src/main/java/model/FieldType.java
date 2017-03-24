package model;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface FieldType 
{

	public String getClassName() ;

	public String getName() ;

	//Just one of those will be true //
	public Boolean isUsesList() ;
	
	public Boolean isInteger() ;

	public Boolean isDecimal() ;
	
	//END JUST ONE //

}

