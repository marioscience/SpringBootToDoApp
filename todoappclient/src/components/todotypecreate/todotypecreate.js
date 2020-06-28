import React from 'react';
import './todotypecreate.css';

class Todotypecreate extends React.Component {
    render() {
        return (
            <div className="create-type">
                <label>Environment <input type="text" /></label>
                <label>Name <input type="text" /></label>
                <label>Importance: <select>
                    <option value="high">High</option>
                    <option value="normal">Normal</option>
                    <option value="low">Low</option>
                </select></label>
                <button>Save!</button>
            </div>
        );
    }
}

export default Todotypecreate;