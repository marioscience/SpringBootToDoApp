import React from 'react';

import Task from '../task/task';
import './tasklist.css';

class Tasklist extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            todoItems: []
        }
    }

    componentDidMount() {
        fetch("http://localhost:8080/tasks")
            .then(response => {
                response.json().then(data => {
                    this.setState({
                        todoItems: data._embedded.task.map(t => {
                            return {title: t.title, description: t.description};
                        })
                    });
                });
            })
            .catch(error => console.log(error));
    }

    render() {
        const listItems = this.state.todoItems.map(t => <li className="todo-items">title: {t.title}, description: {t.description}</li>);
        console.log(listItems);
        return (
            <div>
                <h1>Tasks.</h1>
                <ul>
                    {listItems}
                </ul>
                <Task></Task>
            </div>
        );
    }
}

export default Tasklist;