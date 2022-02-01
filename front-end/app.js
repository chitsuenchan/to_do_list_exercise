
const tasksContainer = document.querySelector('#tasks')


const addTask = function(task) {
    // Creating a new task
    const newTask = document.createElement('li')
    const newTaskDiv = document.createElement('div')
    newTaskDiv.classList.add('box')
    newTaskDiv.classList.add('mt-3')
    const bTag = document.createElement('b')
    bTag.append(`- ${task}`)
    newTaskDiv.append(bTag)
    newTask.append(newTaskDiv)
    
    // Adding the new tweet to the tweets container
    tasksContainer.append(newTask)
}


// addTask('hello')
// addTask('hey')
// addTask('hiya')
// addTask('hi')

addTask('buy milk')
addTask('buy cookies')


