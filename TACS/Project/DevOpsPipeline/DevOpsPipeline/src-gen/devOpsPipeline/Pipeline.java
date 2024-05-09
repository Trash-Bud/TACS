/**
 */
package devOpsPipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devOpsPipeline.Pipeline#getSourcerepo <em>Sourcerepo</em>}</li>
 * </ul>
 *
 * @see devOpsPipeline.DevOpsPipelinePackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Sourcerepo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcerepo</em>' containment reference.
	 * @see #setSourcerepo(SourceRepo)
	 * @see devOpsPipeline.DevOpsPipelinePackage#getPipeline_Sourcerepo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceRepo getSourcerepo();

	/**
	 * Sets the value of the '{@link devOpsPipeline.Pipeline#getSourcerepo <em>Sourcerepo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourcerepo</em>' containment reference.
	 * @see #getSourcerepo()
	 * @generated
	 */
	void setSourcerepo(SourceRepo value);

} // Pipeline
