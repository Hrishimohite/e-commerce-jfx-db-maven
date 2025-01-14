package org.dnyanyog.productmanagment;

import org.dnyanyog.addproduct.AddProduct;
import org.dnyanyog.choicescreen.ChoiceScreen;
import org.dnyanyog.deleteproduct.DeleteProduct;
import org.dnyanyog.searchproduct.SearchProduct;
import org.dnyanyog.updateproduct.UpdateProduct;

public class ProductManagementController {

	public void addProductButtonClick() throws Exception {
		new AddProduct().show();

	}

	public void updateProductButtonClick() throws Exception {
		new UpdateProduct().show();

	}

	public void searchProductButtonClick() throws Exception {
		new SearchProduct().show();

	}

	public void deleteProductButtonClick() throws Exception {
		new DeleteProduct().show();

	}

	public void backButtonClick() throws Exception {
		new ChoiceScreen().show();

	}

}
