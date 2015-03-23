/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SQL2003_V3.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import SQL2003_V3.SQL2003_V3Factory;
import SQL2003_V3.SQL2003_V3Package;
import SQL2003_V3.Table;

/**
 * This is the item provider adapter for a {@link SQL2003_V3.Table} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addViewsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Views feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_views_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_views_feature", "_UI_Table_type"),
				 SQL2003_V3Package.Literals.TABLE__VIEWS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_name_feature", "_UI_Table_type"),
				 SQL2003_V3Package.Literals.TABLE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SQL2003_V3Package.Literals.TABLE__COLUMNS);
			childrenFeatures.add(SQL2003_V3Package.Literals.TABLE__RESTRICTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Table)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Table_type") :
			getString("_UI_Table_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Table.class)) {
			case SQL2003_V3Package.TABLE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SQL2003_V3Package.TABLE__COLUMNS:
			case SQL2003_V3Package.TABLE__RESTRICTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SQL2003_V3Package.Literals.TABLE__COLUMNS,
				 SQL2003_V3Factory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(SQL2003_V3Package.Literals.TABLE__RESTRICTIONS,
				 SQL2003_V3Factory.eINSTANCE.createDomainConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SQL2003_V3Package.Literals.TABLE__RESTRICTIONS,
				 SQL2003_V3Factory.eINSTANCE.createNotNull()));

		newChildDescriptors.add
			(createChildParameter
				(SQL2003_V3Package.Literals.TABLE__RESTRICTIONS,
				 SQL2003_V3Factory.eINSTANCE.createUniqueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SQL2003_V3Package.Literals.TABLE__RESTRICTIONS,
				 SQL2003_V3Factory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(SQL2003_V3Package.Literals.TABLE__RESTRICTIONS,
				 SQL2003_V3Factory.eINSTANCE.createReferentialConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SQL2003_V3Package.Literals.TABLE__RESTRICTIONS,
				 SQL2003_V3Factory.eINSTANCE.createTableCheckConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(SQL2003_V3Package.Literals.TABLE__RESTRICTIONS,
				 SQL2003_V3Factory.eINSTANCE.createTrigger()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SQL2003_V3EditPlugin.INSTANCE;
	}

}
