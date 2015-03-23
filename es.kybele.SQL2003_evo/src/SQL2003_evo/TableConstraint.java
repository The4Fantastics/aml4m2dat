/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_evo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SQL2003_evo.TableConstraint#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SQL2003_evo.SQL2003_evoPackage#getTableConstraint()
 * @model abstract="true"
 * @generated
 */
public interface TableConstraint extends Restriction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SQL2003_evo.SQL2003_evoPackage#getTableConstraint_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SQL2003_evo.TableConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TableConstraint
