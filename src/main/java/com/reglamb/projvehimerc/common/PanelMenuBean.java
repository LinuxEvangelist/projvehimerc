package com.reglamb.projvehimerc.common;

import javax.faces.bean.ManagedBean;
import org.richfaces.event.ItemChangeEvent;

@ManagedBean
public class PanelMenuBean {
	private String current;
	public PanelMenuBean() {
	}
	
	public void updateCurrent(ItemChangeEvent evt) {
	        setCurrent(evt.getNewItemName());
	}
	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}
	
}
	
	
	/*
    private String menuSelected;

    public String getMenuSelected() {
        return menuSelected;
    }

    public PanelMenuBean() {
    }

    public void listenerNew(ActionEvent event) {
        menuSelected = "New";
    }

    public void listenerOpenFile(ActionEvent event) {
        menuSelected = "Open File...";
    }

    public void listenerSave(ActionEvent event) {
        menuSelected = "Save";
    }

    public void listenerSaveAll(ActionEvent event) {
        menuSelected = "Save All";
    }

    public void listenerFileGroup() {
        menuSelected = "File Group";
    }
*/
	

 