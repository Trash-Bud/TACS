package org.eclipse.emfforms.coffee.model.editor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emfforms.coffee.model.coffee.Component;

public class CostCalculator {
	
/*	public static void clickOnComponent(Component component) {
		int cost = calculateCost(component);
		// Unimplemented
		CostControllingSystem.sendCost(cost);
		EContentAdapter contentAdapter = new EContentAdapter() {
			
			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				int calculateCost = calculateCost(component);
				// Unimplemented
				CostControllingSystem.updateCost(calculateCost);
			}
		};
		component.eAdapters().add(contentAdapter);
	}
	
	private static int calculateCost(Component component) {
		int cost = component.getCost();
		TreeIterator<EObject> contents = component.eAllContents();
		
		while(contents.hasNext()) {
			EObject next = contents.next();
			if (next instanceof Component) {
				cost = cost + ((Component) next).getCost();
			}
		}
		
		return cost;
	}*/

}
