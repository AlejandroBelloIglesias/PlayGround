import UIKit

extension String {
    func width(font: UIFont) -> CGFloat {
        let maxSize = CGSize(width: CGFloat.greatestFiniteMagnitude, height: CGFloat.greatestFiniteMagnitude)
        let actualSize = self.boundingRect(with: maxSize, options: [.usesLineFragmentOrigin], attributes: [.font : font], context: nil)
        return actualSize.width
    }
}


//Create a new top-side tab bar component extending from UIViewController.
//The component can contain multiple UITabBarItem.
class TabBarController: UITabBarController {

    //Create an array of UITabBarItems.
    var items: [UITabBarItem] = []

    //Create an array of UIViewController.
    var viewControllers: [UIViewController] = []

    //Create a UIView to hold the UITabBarItems.
    var tabBarView: UIView = UIView()

    //Function to add a UITabBarItem with it's controller to the component.
    func addItem(item: UITabBarItem, controller: UIViewController) {
        items.append(item)
        viewControllers.append(controller)
    }

    //Function that takes an index to delete a UITabBarItem with it's controller from the component.
    func deleteItem(index: Int) {
        items.remove(at: index)
        viewControllers.remove(at: index)
    }
    
}


