import React from 'react';
import './labelcreate.css';

class Labelcreate extends React.Component {
    render() {
        return (
            <div className="create-label">
                <label>Name <input type="text" /></label>
                <label>Description <input type="text" /></label>
                <label>Color <input type="text" /></label>
                <button>Save!</button>
            </div>
        );
    }
}

export default Labelcreate;