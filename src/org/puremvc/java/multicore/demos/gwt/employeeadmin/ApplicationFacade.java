/*
 PureMVC Java MultiCore Demo - GWT Employee Admin by Anthony Quinault <anthony.quinault@puremvc.org>
 Based upon PureMVC AS3 Demo - Flex Employee Admin - Copyright(c) 2007-08 Cliff Hall <clifford.hall@puremvc.org>
 Your reuse is governed by the Creative Commons Attribution 3.0 License
 */

package org.puremvc.java.multicore.demos.gwt.employeeadmin;

import org.puremvc.java.multicore.demos.gwt.employeeadmin.controller.AddRoleResultCommand;
import org.puremvc.java.multicore.demos.gwt.employeeadmin.controller.DeleteUserCommand;
import org.puremvc.java.multicore.demos.gwt.employeeadmin.controller.StartupCommand;
import org.puremvc.java.multicore.patterns.facade.Facade;

import com.google.gwt.user.client.ui.Panel;

/**
 * Application facade. <i>Singleton</i>
 */
public class ApplicationFacade extends Facade {

	/**
	 * Startup. <br>
	 * Body : Panel
	 */
	public static final String STARTUP = "startup";

	/**
	 * Key of this facade.
	 */
	public static final String NAME = "ApplicationFacade";

	/**
	 * Unique instance.
	 */
	private static ApplicationFacade instance = null;

	/**
	 * NewUser. <br>
	 * Body : UserVO
	 */
	public static final String NEW_USER = "newUser";

	/**
	 * DeleteUser. <br>
	 * Body : UserVO
	 */
	public static final String DELETE_USER = "deleteUser";

	/**
	 * CancelSelected. <br>
	 * Body : UserVO
	 */
	public static final String CANCEL_SELECTED = "cancelSelected";

	/**
	 * UserSelected. <br>
	 * Body : UserVO
	 */
	public static final String USER_SELECTED = "userSelected";

	/**
	 * UserAdded. <br>
	 * Body : UserVO
	 */
	public static final String USER_ADDED = "userAdded";

	/**
	 * UserUpdated. <br>
	 * Body : UserVO
	 */
	public static final String USER_UPDATED = "userUpdated";

	/**
	 * UserDeleted. <br>
	 * Body : UserVO
	 */
	public static final String USER_DELETED = "userDeleted";

	/**
	 * InitUsers. <br>
	 * Body : Null
	 */
	public static final String INIT_USERS = "initUsers";

	/**
	 * AddRole. <br>
	 * Body : RoleVO
	 */
	public static final String ADD_ROLE = "addRole";

	/**
	 * AddRoleResult. <br>
	 * Body : Boolean
	 */
	public static final String ADD_ROLE_RESULT = "addRoleResult";

	/**
	 * Constructor.
	 */
	protected ApplicationFacade() {
		super(NAME);
	}

	/**
	 * get the instance.
	 * @return the singleton
	 */
	public static ApplicationFacade getInstance() {
		if (instance == null) {
			instance = new ApplicationFacade();
		}
		return instance;
	}

    /**
     * Start the application.
     * @param panel the panel
     */
    public final void startup(final Panel panel) {
         sendNotification(STARTUP, panel);    
     }
	
	/**
	 * Initialize controller. Register the commands.
	 */
	protected final void initializeController() {
		super.initializeController();
		registerCommand(STARTUP, new StartupCommand());
		registerCommand(DELETE_USER, new DeleteUserCommand());
		registerCommand(ADD_ROLE_RESULT, new AddRoleResultCommand());
	}
}
