import React from 'react';

class Tasklistitem extends React.Component {
    render() {
        return (
            <ul>
                <li>Title: {this.props.title}</li>
                <li>Description: {this.props.description}</li>
            </ul>
        );
    }
}

export default Tasklistitem;