import React from 'react';
import { useForm } from "react-hook-form";
import { connect } from 'react-redux';
import { postData } from './redux/actions/actions';

const Question5 = (props) => {

    const { register, handleSubmit, watch, errors } = useForm({
        defaultValues: {
            name: "",
            email: "",
            password: ""
        }
    });

    const onSubmit = data => {
        console.log("alert here")
    }
    return (
        <form onSubmit={handleSubmit(onSubmit)}>

            {submitErrors && submitErrors.map(
                error => <div class='error-notification'>{error.message}</div>
            )}

            <div class='input-container'>
                <label>Name</label>
                <input name="name" ref={register({ required: true, pattern: /^[A-Za-z\s]+$/i })} />
                {errors && errors.name && <span class='input-error'>Name is a required field</span>}
            </div>


            <div class='input-container'>
                <label>Email</label>
                <input name="email" ref={register({ pattern: /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/ })} />
                {errors && errors.email && <span class='input-error'>Email is a invalid</span>}
            </div>

            <div class='input-container'>
                <label>Password</label>
                <input name="password" ref={register({ pattern: /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/ })} />
                {errors && errors.email && <span class='input-error'>Password must contain: one number and one uppercase and lowercase letter, and at least 8 or more characters</span>}
            </div>

            {/*  */}

            <button
                className="popupButton"
                type="submit"
            >
                <FaCheck style={{ marginRight: 10, height: "60px" }} />CONFIRM BOOKING
        </button>

            <div className="cancel-link" onClick={() => setPage('barbers')}>
                Cancel
        </div>

        </form>
    )
}

//map to state redux
const mapStateToProps = (state) => {
    return {
        result: state.root.result
    }
}

//export
export default connect(mapStateToProps, { postData })(Question5)