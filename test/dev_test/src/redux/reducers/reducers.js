import {
    GET_NAME_COUNTRY,
    GET_INFO,
    GET_COUNTRIES,
    GET_RESULT
} from '../actions/types';

const initialState = {
    name: '',
    info: '',
    country: '',
    result: 0,
    responsePost:''
}

const reducers = (state = initialState, action) => {
    switch (action.type) {
        case GET_NAME_COUNTRY:
            return {
                ...state,
                name: action.payload
            }

        case GET_INFO:
            return {
                ...state,
                info: action.payload
            }
        case GET_COUNTRIES:
            return {
                ...state,
                country: action.payload
            }
        case GET_RESULT:
            return {
                ...state,
                result: action.payload
            }

            case POST_DATA:
                return{
                    ...state,
                    responsePost:action.payload
                }


        default:
            return state
    }
}

export default reducers