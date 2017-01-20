/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.xtext.iGES.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.january.geometry.xtext.iGES.IGESPackage;
import org.eclipse.january.geometry.xtext.iGES.PEntry;
import org.eclipse.january.geometry.xtext.iGES.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PEntry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.january.geometry.xtext.iGES.impl.PEntryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.xtext.iGES.impl.PEntryImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.xtext.iGES.impl.PEntryImpl#getDIndex <em>DIndex</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.xtext.iGES.impl.PEntryImpl#getIndicies <em>Indicies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PEntryImpl extends MinimalEObjectImpl.Container implements PEntry
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final int TYPE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected int type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<Value> values;

  /**
   * The default value of the '{@link #getDIndex() <em>DIndex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDIndex()
   * @generated
   * @ordered
   */
  protected static final int DINDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDIndex() <em>DIndex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDIndex()
   * @generated
   * @ordered
   */
  protected int dIndex = DINDEX_EDEFAULT;

  /**
   * The cached value of the '{@link #getIndicies() <em>Indicies</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndicies()
   * @generated
   * @ordered
   */
  protected EList<Integer> indicies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PEntryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IGESPackage.Literals.PENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(int newType)
  {
    int oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IGESPackage.PENTRY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<Value>(Value.class, this, IGESPackage.PENTRY__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDIndex()
  {
    return dIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDIndex(int newDIndex)
  {
    int oldDIndex = dIndex;
    dIndex = newDIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IGESPackage.PENTRY__DINDEX, oldDIndex, dIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getIndicies()
  {
    if (indicies == null)
    {
      indicies = new EDataTypeEList<Integer>(Integer.class, this, IGESPackage.PENTRY__INDICIES);
    }
    return indicies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IGESPackage.PENTRY__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IGESPackage.PENTRY__TYPE:
        return getType();
      case IGESPackage.PENTRY__VALUES:
        return getValues();
      case IGESPackage.PENTRY__DINDEX:
        return getDIndex();
      case IGESPackage.PENTRY__INDICIES:
        return getIndicies();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IGESPackage.PENTRY__TYPE:
        setType((Integer)newValue);
        return;
      case IGESPackage.PENTRY__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends Value>)newValue);
        return;
      case IGESPackage.PENTRY__DINDEX:
        setDIndex((Integer)newValue);
        return;
      case IGESPackage.PENTRY__INDICIES:
        getIndicies().clear();
        getIndicies().addAll((Collection<? extends Integer>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IGESPackage.PENTRY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case IGESPackage.PENTRY__VALUES:
        getValues().clear();
        return;
      case IGESPackage.PENTRY__DINDEX:
        setDIndex(DINDEX_EDEFAULT);
        return;
      case IGESPackage.PENTRY__INDICIES:
        getIndicies().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IGESPackage.PENTRY__TYPE:
        return type != TYPE_EDEFAULT;
      case IGESPackage.PENTRY__VALUES:
        return values != null && !values.isEmpty();
      case IGESPackage.PENTRY__DINDEX:
        return dIndex != DINDEX_EDEFAULT;
      case IGESPackage.PENTRY__INDICIES:
        return indicies != null && !indicies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", dIndex: ");
    result.append(dIndex);
    result.append(", indicies: ");
    result.append(indicies);
    result.append(')');
    return result.toString();
  }

} //PEntryImpl
