import * as actions from './types'
const axios = require('axios').default;

export const getInfo = (data) => async (dispatch) => {

    let error

    const response = await axios({
        method: `get`,
        url: `https://restcountries.eu/rest/v2/name/${data}`,
        // baseURL: restAPI,
    }).catch((er) =>
        error = er
    )

    if (error) {
        dispatch({
            type: actions.GET_INFO,
            payload: "Error"
        })
    } else {
        dispatch({
            type: actions.GET_INFO,
            payload: response
        })
    }
}


export const getAllCountries = (data) => async (dispatch) => {
    let error

    const response = await axios({
        method: `get`,
        url: `https://restcountries.eu/rest/v2/all`,
    }).catch((er) =>
        error = er
    )

    if (error) {
        dispatch({
            type: actions.GET_COUNTRIES,
            payload: "Error"
        })
    } else {
        dispatch({
            type: actions.GET_COUNTRIES,
            payload: response
        })
    }
}


export const getNameCountry = (data) => (dispatch) => {
    dispatch({
        type: actions.GET_NAME_COUNTRY,
        payload: data
    })
}

export const postData = (data) => (dispatch) => {
    dispatch({
        type: actions.POST_DATA,
        payload: data
    })
}

const sendResult = (result) => (
    console.log(result),
    {
    type: actions.GET_RESULT,
    payload: result
})

export const getResult = (data) => (dispatch) => {

    if (data[0]) {
        if (data[0].name === data[1].name && data[1].name === data[2].name) {
            if (data[0].name === 'cherry') {
                return dispatch(sendResult(50))
            } else if (data[0].name === 'apple') {
                return dispatch(sendResult(20))
            } else if (data[0].name === 'banana') {
                return dispatch(sendResult(15))
            } else if (data[0].name === 'lemon') {
                return dispatch(sendResult(3))
            }
        } else if (data[0].name === data[1].name) {
            // console.log(data, 'result back end')
            if (data[0].name === 'cherry') {
                return dispatch(sendResult(40))
            } else if (data[0].name === 'apple') {
                return dispatch(sendResult(10))
            } else if (data[0].name === 'banana') {
                return dispatch(sendResult(5))
            }
        } else if (data[1].name === data[2].name) {
            // console.log(data, 'result back end')
            if (data[1].name === 'cherry') {
                return dispatch(sendResult(40))
            } else if (data[1].name === 'apple') {
                return dispatch(sendResult(10))
            } else if (data[1].name === 'banana') {
                return dispatch(sendResult(5))
            }

        } else if (data[0] === data[2]) {
            if (data[0].name === 'cherry') {
                return dispatch(sendResult(40))
            } else if (data[0].name === 'apple') {
                return dispatch(sendResult(10))
            } else if (data[0].name === 'banana') {
                return dispatch(sendResult(5))
            }

        } else {
            dispatch(sendResult(0))
        }
    }
}