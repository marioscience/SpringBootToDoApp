import React from 'react';
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
    } from 'react-router-dom';

import './navbar.css'

import Tasklist from "../tasklist/tasklist";
import Labelcreate from "../labelcreate/labelcreate";
import Todotypecreate from "../todotypecreate/todotypecreate";


class Navbar extends React.Component {
    render() {
        return  (
            <Router>
                <div className="navbar">
                    <div className="navbar-content">
                        <div className="logo-section">
                            <h3>ToDo App</h3>
                        </div>
                        <div className="link-section">
                            <ul>
                                <li><Link to="/tasks">Tasks</Link></li>
                                <li><Link to="/addlabels">Add Labels</Link></li>
                                <li><Link to="/addtypes">Add Types</Link></li>
                            </ul>
                        </div>
                        <div className="user-section">
                            <div className="user-box">
                                <p>Welcome, Mario.</p>
                            </div>
                        </div>
                    </div>
                </div>

                <Switch>
                    <Route path="/tasks">
                        <Tasklist></Tasklist>
                    </Route>
                    <Route path="/addlabels">
                        <Labelcreate></Labelcreate>
                    </Route>
                    <Route path="/addtypes">
                        <Todotypecreate></Todotypecreate>
                    </Route>
                </Switch>
            </Router>
        );
    }
}

export default Navbar;