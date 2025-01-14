package org.dnyanyog.usermanagement;

import org.dnyanyog.adduser.AddUser;
import org.dnyanyog.choicescreen.ChoiceScreen;
import org.dnyanyog.deleteuser.DeleteUser;
import org.dnyanyog.searchuser.SearchUser;
import org.dnyanyog.updateuser.UpdateUser;

public class UserManagementController {

	public void addUserButtonClick() throws Exception{
		new AddUser().show();

	}
	public void updateUserButtonClick() throws Exception{
		new UpdateUser().show();
		
	}
	public void searchUserButtonClick() throws Exception{
		new SearchUser().show();
		
	}
	public void deleteUserButtonClick() throws Exception{
		new DeleteUser().show();
		
	}
	public void backButtonClick() throws Exception{
		new ChoiceScreen().show();
		
	}

}
