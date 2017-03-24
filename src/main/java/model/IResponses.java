package model;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface IResponses 
{
	public IPolls getPoll() ;
	
	public IPages getPage() ;
	
	public IQuestions getquestion() ;
	
	public IFields getField() ;
	
	public Object getResponse() ;
	
	/*Usuario que respondio a la encuesta*/
	public IUsers  getUser();

}

