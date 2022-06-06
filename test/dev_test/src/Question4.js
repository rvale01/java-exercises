import React, { useState, useEffect } from 'react'
//redux
import { connect } from 'react-redux';
import { getResult } from './redux/actions/actions';
import Slot from 'react-slot-machine'


const list = [
    { name: '? ? ?', color: '#000' },
    { name: 'Sakuranomiya\nMaika', color: '#f05274' },
    { name: 'Hinata\nKaho', color: '#48cefb' },
    { name: 'Hoshikawa\nMahuyu', color: '#fedf38' },
    { name: 'Amano\nMiu', color: '#ba5ad1' },
    { name: 'Kanzaki\nHideri', color: '#5bd096' },
    { name: 'Dino', color: '#9fa0a0' },
    { name: 'Akiduki\nKouyou', color: '#50b15c' },
];

class Question4 extends React.Component {
    constructor() {
        super();
        this.state = {
            target: 1,
            times: 1,
            duration: 3000,
            turn: true,
            reel1: [
                { name: "cherry" },
                { name: "lemon" },
                { name: "apple" },
                { name: "lemon" },
                { name: "banana" },
                { name: "banana" },
                { name: "lemon" },
                { name: "lemon" },
            ],
            reel2: [
                { name: "lemon" },
                { name: "apple" },
                { name: "lemon" },
                { name: "lemon" },
                { name: "cherry" },
                { name: "apple" },
                { name: "banana" },
                { name: "lemon" },
            ],
            reel3: [
                { name: "lemon" },
                { name: "apple" },
                { name: "lemon" },
                { name: "apple" },
                { name: "cherry" },
                { name: "lemon" },
                { name: "banana" },
                { name: "lemon" },
            ],
        };
    }
    // const[reel1, set1] = useState(["cherry", "lemon", "apple", "lemon", "banana", "banana", "lemon", "lemon"]);
    // const[reel2, set2] = useState(["lemon", "apple", "lemon", "lemon", "cherry", "apple", "banana", "lemon"]);
    // const[reel3, set3] = useState(["lemon", "apple", "lemon", "apple", "cherry", "lemon", "banana", "lemon"])



    handleClick = (e) => {
        e.preventDefault()
        let data = []
        this.setState({
            target1: Math.floor(Math.random() * (this.state.reel1.length)),
            target2: Math.floor(Math.random() * (this.state.reel2.length)),
            target3: Math.floor(Math.random() * (this.state.reel3.length)),
            coins: this.state.coins - 1
        }, function () {
            let data = [
                this.state.reel1[this.state.target1],
                this.state.reel2[this.state.target2],
                this.state.reel3[this.state.target3]
            ]
            this.props.getResult(data)
            // console.log(this.props.result, 'res')
        })
        // console.log(this.props.result, 'res')
        // this.setState({
        //     coins: this.state.coins + this.props.result
        // })

        // console.log(this.props.result, 'did I win?')

    }

    render() {
        return (
            <div style={{ display: 'flex' }}>
                <style jsx>
                    {`
            .slot {
              font-size: 30;
              height: 50px;
            }
            .slot-item {
              height: 100%;
              width: 100%;
            }
            button {
              color: #000;
              background: #fff;
              border: solid 1px;
              border-radius: 3px;
            }
            label {
              display: block;
              margin: 1em 0;
            }
          `}
                </style>

                <button
                    onClick={(e) =>
                        this.handleClick(e)
                    }
                >
                    set random
                </button>


                <Slot
                    className="slot"
                    duration={4000}
                    target={this.state.target1}
                    times={7}
                >
                    {this.state.reel1.map(({ name, color }) => (
                        <div style={{ color }}>
                            {name.split('\n').map(v => <div style={{ fontSize: 30 }}>{v}</div>)}
                        </div>
                    ))}
                </Slot>

                <Slot
                    className="slot"
                    duration={4000}
                    target={this.state.target2}
                    times={7}
                >
                    {this.state.reel2.map(({ name, color }) => (
                        <div style={{ color }}>
                            {name.split('\n').map(v => <div style={{ fontSize: 30 }}>{v}</div>)}
                        </div>
                    ))}
                </Slot>

                <Slot
                    className="slot"
                    duration={4000}
                    target={this.state.target3}
                    times={7}
                >
                    {this.state.reel3.map(({ name, color }) => (
                        <div style={{ color }}>
                            {name.split('\n').map(v => <div style={{ fontSize: 30 }}>{v}</div>)}
                        </div>
                    ))}
                </Slot>
            </div >
        )
    }
}


//map to state redux
const mapStateToProps = (state) => {
    return {
        result: state.root.result
    }
}

// const mapDispatchToProps = dispatch => ({
//     getInfo: (e) => dispatch(getInfo(e)),
// });

//export
export default connect(mapStateToProps, { getResult })(Question4)
