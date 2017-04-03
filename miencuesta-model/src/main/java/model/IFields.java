package model;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface IFields 
{
	
	public List<IDataList> getDataList() ;
	
	public FieldType getType() ;
	
	
	/**
	 * La idea es que de alguna forma
	 * devuelva una expresion que al evaluarla
	 * verifique si los datos estan validos.
	 * 
	 *  Puede haber mas de una validadacion y cada una de
	 *  estas al evaluar negativo debera dar un mensaje claro
	 *  del motivo. O sea, tener un mensaje por cada validacion
	 *  Esto se podra configurar por sistema
	 * @return
	 */
	public Object getExpressionValidation();
	//TODO definir como seran las validaciones
	
	public Object getExpressionShow();


}

