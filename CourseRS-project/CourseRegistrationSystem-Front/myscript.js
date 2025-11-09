function showCourses(){ 
    // alert("these are your course")

    fetch("http://localhost:8080/courses") // API end point
    .then((response) => response.json())
    .then((courses) =>{ 
        const dataTable = document.getElementById("coursetable")

        courses.forEach(course => { 
            var row = `<tr>
                <td>${course.courseId}</td>
                <td>${course.courseName}</td>
                <td>${course.trainer}</td>
                <td>${course.durationInWeeks}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });

    });
}
function showenrolledstudents(){ 
    // alert("these are your course")

    fetch("http://localhost:8080/courses/enroll") // API end point
    .then((response) => response.json())
    .then((students) =>{ 
        const dataTable = document.getElementById("enrolledtable")

        students.forEach(course => {  
            var row = `<tr>
                <td>${course.id}</td>
                <td>${course.name}</td>
                <td>${course.emailId}</td>
                <td>${course.courseName}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });

    });
}

// function showCourses(){
//     fetch("http://localhost:8080/courses") //API End point
//     .then((response) => response.json())
//     .then((courses) => {
//         const dataTable = document.getElementById("coursetable")

//         courses.forEach(course => {
//             var row = `<tr>
//             <td>${course.courseId}</td>
//             <td>${course.courseName}</td>
//             <td>${course.trainer}</td>
//             <td>${course.durationInWeeks}</td>
//             </tr>`

//             dataTable.innerHTML+=row;
//         });
//     });
// }