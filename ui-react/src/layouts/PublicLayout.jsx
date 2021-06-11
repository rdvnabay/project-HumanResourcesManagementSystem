import { Slot } from 'react-page-layout';
 import React from 'react'

export default function PublicLayout() {
    return (
        <div>
        <header>Page Header</header>
        <Slot name="main" />
        <footer>Page Footer</footer>
    </div>
    )
}
//export default PublicLayout;