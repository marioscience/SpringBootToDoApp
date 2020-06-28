import React from 'react';

class Task extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            title: "",
            description: ""
        }

        this.handleTitleChange.bind(this);
        this.handleDescriptionChange.bind(this);
        this.handleDateChange.bind(this);
        this.save.bind(this);
    }

    handleTitleChange(event) {
        this.setState({title: event.target.value})
    }

    handleDescriptionChange(event) {
        this.setState({description: event.target.value})
    }

    handleDateChange(event) {
        this.setState({date: event.target.value})
    }

    save() {
        const body = {
            title: this.state.title,
            description: this.state.description
        }

        fetch("http://localhost:8080/tasks", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(body)
        })
        .then(response => {
            console.log(response);
            this.setState({title: response.title, description: response.description})
            alert("please refresh to see you new item");
        })
        .catch(error => {
            console.log('there was an error: ' + error)
        });
    }


    render() {
        return (
            <div>
                <label>Title: <input
                    type="text"
                    value={this.state.title}
                    onChange={e => this.handleTitleChange(e)}
                ></input></label>
                <label>Description: <input
                    type="text"
                    value={this.state.description}
                    onChange={e => this.handleDescriptionChange(e)}
                ></input></label>
                <label>Start Date: <input
                    type="date"
                    value={this.state.startDate}
                    onChange={e => this.handleDateChange(e)}
                ></input></label>
                <button onClick={() => this.save()}>Save</button>
            </div>
        );
    }
}

export default Task;