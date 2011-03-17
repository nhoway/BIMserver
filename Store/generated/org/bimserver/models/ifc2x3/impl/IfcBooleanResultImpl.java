/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcBooleanOperand;
import org.bimserver.models.ifc2x3.IfcBooleanOperator;
import org.bimserver.models.ifc2x3.IfcBooleanResult;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boolean Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcBooleanResultImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcBooleanResultImpl#getFirstOperand <em>First Operand</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcBooleanResultImpl#getSecondOperand <em>Second Operand</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcBooleanResultImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBooleanResultImpl extends IfcGeometricRepresentationItemImpl implements IfcBooleanResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBooleanResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcBooleanResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanOperator getOperator() {
		return (IfcBooleanOperator)eGet(Ifc2x3Package.eINSTANCE.getIfcBooleanResult_Operator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(IfcBooleanOperator newOperator) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBooleanResult_Operator(), newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanOperand getFirstOperand() {
		return (IfcBooleanOperand)eGet(Ifc2x3Package.eINSTANCE.getIfcBooleanResult_FirstOperand(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstOperand(IfcBooleanOperand newFirstOperand) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBooleanResult_FirstOperand(), newFirstOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanOperand getSecondOperand() {
		return (IfcBooleanOperand)eGet(Ifc2x3Package.eINSTANCE.getIfcBooleanResult_SecondOperand(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondOperand(IfcBooleanOperand newSecondOperand) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBooleanResult_SecondOperand(), newSecondOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDim() {
		return (Integer)eGet(Ifc2x3Package.eINSTANCE.getIfcBooleanResult_Dim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDim(int newDim) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBooleanResult_Dim(), newDim);
	}

} //IfcBooleanResultImpl